/**
 * Copyright (C) 2014 陕西威尔伯乐信息技术有限公司
 * @Package com.wellbole.web.sys.login  
 * @Title: LoginController.java  
 * @Description: 登录Controller   
 * @author 李飞 (lifei@wellbole.com)    
 * @date 2014年9月8日  下午9:19:51  
 * @since V1.0.0 
 *
 * Modification History:
 * Date         Author      Version     Description
 * -------------------------------------------------------------
 * 2014年9月8日      李飞                       V1.0.0        新建文件   
 */
package com.lion.sys.mvc.login;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.lion.sys.mvc.base.BaseController;
import com.lion.sys.plugin.shiro.ext.CaptchaFormAuthenticationInterceptor;
import com.lion.sys.plugin.shiro.ext.CaptchaRender;
import com.lion.sys.plugin.shiro.ext.CaptchaUsernamePasswordToken;
import com.lion.sys.plugin.shiro.ext.IncorrectCaptchaException;


public class LoginController extends BaseController {
    
    private static final Logger LOG = Logger.getLogger(LoginController.class);
    private static final int DEFAULT_CAPTCHA_LEN = 4;//验证码长度
    private static final String LOGIN_URL = "/login.do";
    
    @ActionKey("/login")
    public void login(){
    	this.createToken("loginToken");
        this.render("/login.html");
    }
    
    /**
     * @Title: img  
     * @Description: 图形验证码   
     * @since V1.0.0
     */
    @ActionKey("/img")
    public void img(){
        CaptchaRender img = new CaptchaRender(DEFAULT_CAPTCHA_LEN);
        this.setSessionAttr(CaptchaRender.DEFAULT_CAPTCHA_MD5_CODE_KEY, img.getMd5RandonCode());
        render(img);
    }
    
    @Before({LoginValidator.class, CaptchaFormAuthenticationInterceptor.class})
    @ActionKey("/doLogin")
    public void doLogin(){
        try {
            CaptchaUsernamePasswordToken token = this.getAttr("shiroToken");
            Subject subject = SecurityUtils.getSubject();
            ThreadContext.bind(subject);
            //进行用用户名和密码验证
            subject.login(token);
            //获取当前用户，并将当前用户保存在Session中。
            User user = User.DAO.findByUsername(token.getUsername());
            //this.setSessionAttr("user", user);
            //保存用户默认的皮肤
            if(user != null){
                this.setSessionAttr("skin", user.getStr("skin"));
            }else{
                this.setSessionAttr("skin", "flat");
            }
            //调转到主页面
            this.redirect("/index.do");
        } catch (IncorrectCaptchaException e) {
        	LOG.error(e.getMessage());
//            this.redirect(LOGIN_URL, new Flash("msg","验证码错误"));
        } catch (LockedAccountException e) {
        	LOG.error(e.getMessage());
//            this.redirect(LOGIN_URL, new Flash("msg","账号已被锁定"));
        } catch (AuthenticationException e) {
        	LOG.error(e.getMessage());
//            this.redirect(LOGIN_URL, new Flash("msg","用户名或者密码错误"));
        } catch (Exception e) {
            LOG.error(e.getMessage());
//            this.redirect(LOGIN_URL, new Flash("msg","系统异常"));
        }
    }
    @RequiresAuthentication
    @ActionKey("/logout")
    public void logout() {
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.logout();
            this.removeSessionAttr("user");
            this.redirect(LOGIN_URL);
        } catch (SessionException ise) {
            LOG.debug("Encountered session exception during logout.  This can generally safely be ignored.", ise);
        } catch (Exception e) {
            LOG.debug("登出发生错误", e);
        }
    }
}