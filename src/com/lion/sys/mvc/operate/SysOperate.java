package com.lion.sys.mvc.operate;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.lion.sys.dto.LayTreeNode;
import com.lion.sys.mvc.base.model.BaseSysOperate;
import com.lion.sys.mvc.module.SysModule;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SysOperate extends BaseSysOperate<SysOperate> {
	public static final SysOperate dao = new SysOperate();
	
	/***
	 * 根据主键获取对象
	 * @param id
	 * @return
	 */
	public SysOperate getById(String id){
		return SysOperate.dao.findById(id);
	}
	public Page<Record> getPage(int pnum,int psize,String mid){
		String sql = " from sys_operate o , sys_module m where 1=1 and o.module_id = m.id ";
		if(StringUtils.isNotBlank(mid)){
			sql = sql + "  and o.module_id = '"+mid+"'";
		}
		sql = sql + " order by o.sort";
		return Db.paginate(pnum, psize, "select m.name mname,o.* ", sql);
	}
	/***
	 * 根据角色id获取所有功能
	 * @return
	 */
	public List<SysOperate> getAllOperateByRoleId(String id){
		return SysOperate.dao.find("select o.* from sys_operate o , sys_roleoperator r where o.id=r.operator_id and r.role_id='"+id+"'");
	}
	/***
	 * 根据用户ID获取所有功能
	 * @param userid
	 * @return
	 */
	public List<SysOperate> getOperateByUserId(String userid){
		return SysOperate.dao.find("select o.* from sys_userrole u ,sys_role r , sys_roleoperator ro , sys_operate o where o.id=ro.operator_id and ro.role_id = r.id and  u.role_id=r.id and u.user_id='"+userid+"'");
	}
	
	/***
	 * 根据模块id获取所有模块下功能
	 * @param moduleId
	 * @return
	 */
	public List<SysOperate> getOperateByModuleId(String moduleId){
		return SysOperate.dao.find("select * from sys_operate o where o.module_id='"+moduleId+"' order by o.sort");
	}
	
	/***
	 * 获取赋权所有功能树
	 * @return
	 */
	public List<LayTreeNode> getAllOperatePermisstion(String id){
		List<LayTreeNode> result = new ArrayList<LayTreeNode>(); 
		LayTreeNode root = new LayTreeNode();//声明根目录
    	root.setId("#root");
    	root.setName("根目录");
    	root.setSpread(true);
		List<SysModule> moduleList = SysModule.dao.getAllModule();//所有模块
		List<LayTreeNode> pnodelist = new ArrayList<LayTreeNode>();
		for(SysModule mo : moduleList){//所有根目录模块
			LayTreeNode node = new LayTreeNode();
			node.setId("");
			node.setName(mo.getName());
			node.setSpread(true);
			List<SysModule> childList = mo.getChildren();
			List<LayTreeNode> childnode = new ArrayList<LayTreeNode>();
			for(SysModule cmo : childList){//所有孩子模块
				LayTreeNode childMo = new LayTreeNode();
				childMo.setId("");
				childMo.setName(cmo.getName());
				childMo.setSpread(true);
				List<SysOperate> olist = SysOperate.dao.getOperateByModuleId(cmo.getId());//孩子模块下所有功能
				List<LayTreeNode> onodelist = new ArrayList<LayTreeNode>();
				for(SysOperate o : olist){
					LayTreeNode onode = new LayTreeNode();
					if(SysOperate.dao.roleIfHaveOperate(id,o.getId())){
						onode.setChecked(true);
						childMo.setChecked(true);//所属模块
						node.setChecked(true);//模块父级
						root.setChecked(true);//根节点
					}else{
						onode.setChecked(false);
					}
					onode.setCheckboxValue(o.getId());
					onode.setId(o.getId());
					onode.setName(o.getName());
					onodelist.add(onode);
				}
				childMo.setChildren(onodelist);
				childnode.add(childMo);
			}
			node.setChildren(childnode);
			pnodelist.add(node);
		}
		root.setChildren(pnodelist);
		result.add(root);
		return result;
	}
	
	/***
	 * 判断这个角色是否包含这个功能
	 * @param roleId
	 * @param operateId
	 * @return
	 */
	public Boolean roleIfHaveOperate(String roleId,String operateId){
		Record r = Db.findFirst("select * from sys_roleoperator ro where ro.role_id='"+roleId+"' and ro.operator_id='"+operateId+"'");
		if(r!=null){
			return true;
		}else{
			return false;
		}
		
	}
}