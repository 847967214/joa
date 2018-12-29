package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaApplyBankAccount<M extends BaseOaApplyBankAccount<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setUserid(java.lang.String userid) {
		set("userid", userid);
	}
	
	public java.lang.String getUserid() {
		return getStr("userid");
	}

	public void setApplyerName(java.lang.String applyerName) {
		set("applyer_name", applyerName);
	}
	
	public java.lang.String getApplyerName() {
		return getStr("applyer_name");
	}

	public void setOrgId(java.lang.String orgId) {
		set("org_id", orgId);
	}
	
	public java.lang.String getOrgId() {
		return getStr("org_id");
	}

	public void setOrgName(java.lang.String orgName) {
		set("org_name", orgName);
	}
	
	public java.lang.String getOrgName() {
		return getStr("org_name");
	}

	public void setLeaderMessage(java.lang.String leaderMessage) {
		set("leader_message", leaderMessage);
	}
	
	public java.lang.String getLeaderMessage() {
		return getStr("leader_message");
	}

	public void setLeader2Message(java.lang.String leader2Message) {
		set("leader2_message", leader2Message);
	}
	
	public java.lang.String getLeader2Message() {
		return getStr("leader2_message");
	}

	public void setIfSubmit(java.lang.String ifSubmit) {
		set("if_submit", ifSubmit);
	}
	
	public java.lang.String getIfSubmit() {
		return getStr("if_submit");
	}

	public void setIfComplete(java.lang.String ifComplete) {
		set("if_complete", ifComplete);
	}
	
	public java.lang.String getIfComplete() {
		return getStr("if_complete");
	}

	public void setIfAgree(java.lang.String ifAgree) {
		set("if_agree", ifAgree);
	}
	
	public java.lang.String getIfAgree() {
		return getStr("if_agree");
	}

	public void setProcInsId(java.lang.String procInsId) {
		set("proc_ins_id", procInsId);
	}
	
	public java.lang.String getProcInsId() {
		return getStr("proc_ins_id");
	}

	public void setCreateTime(java.lang.String createTime) {
		set("create_time", createTime);
	}
	
	public java.lang.String getCreateTime() {
		return getStr("create_time");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setDes(java.lang.String des) {
		set("des", des);
	}
	
	public java.lang.String getDes() {
		return getStr("des");
	}

	public void setReason(java.lang.String reason) {
		set("reason", reason);
	}
	
	public java.lang.String getReason() {
		return getStr("reason");
	}

	public void setOpenBank(java.lang.String openBank) {
		set("open_bank", openBank);
	}
	
	public java.lang.String getOpenBank() {
		return getStr("open_bank");
	}

	public void setAccountType(java.lang.String accountType) {
		set("account_type", accountType);
	}
	
	public java.lang.String getAccountType() {
		return getStr("account_type");
	}

	public void setLegelSeal(java.lang.String legelSeal) {
		set("legel_seal", legelSeal);
	}
	
	public java.lang.String getLegelSeal() {
		return getStr("legel_seal");
	}

	public void setFinanceSeal(java.lang.String financeSeal) {
		set("finance_seal", financeSeal);
	}
	
	public java.lang.String getFinanceSeal() {
		return getStr("finance_seal");
	}

	public void setAccountName(java.lang.String accountName) {
		set("account_name", accountName);
	}
	
	public java.lang.String getAccountName() {
		return getStr("account_name");
	}

	public void setAccountNum(java.lang.String accountNum) {
		set("account_num", accountNum);
	}
	
	public java.lang.String getAccountNum() {
		return getStr("account_num");
	}

	public void setChangeToFinanceSeal(java.lang.String changeToFinanceSeal) {
		set("change_to_finance_seal", changeToFinanceSeal);
	}
	
	public java.lang.String getChangeToFinanceSeal() {
		return getStr("change_to_finance_seal");
	}

	public void setChangeToLegalSeal(java.lang.String changeToLegalSeal) {
		set("change_to_legal_seal", changeToLegalSeal);
	}
	
	public java.lang.String getChangeToLegalSeal() {
		return getStr("change_to_legal_seal");
	}

	public void setProjectId(java.lang.String projectId) {
		set("project_id", projectId);
	}
	
	public java.lang.String getProjectId() {
		return getStr("project_id");
	}
	
	public void setProjectName(java.lang.String project_name) {
		set("project_name", project_name);
	}
	
	public java.lang.String getProjectName() {
		return getStr("project_name");
	}
	
	public void setFormProjectId(java.lang.String projectId) {
		set("formproject_id", projectId);
	}
	
	public java.lang.String getFormProjectId() {
		return getStr("formproject_id");
	}

	public void setFormProjectName(java.lang.String project_name) {
		set("formproject_name", project_name);
	}
	
	public java.lang.String getFormProjectName() {
		return getStr("formproject_name");
	}
	
	public void setAudit1Username(java.lang.String audit1_username) {
		set("audit1_username", audit1_username);
	}
	
	public java.lang.String getAudit1Username() {
		return getStr("audit1_username");
	}
	
	public void setAudit2Username(java.lang.String audit2_username) {
		set("audit2_username", audit2_username);
	}
	
	public java.lang.String getAudit2Username() {
		return getStr("audit2_username");
	}
	
	public void setAudit3Username(java.lang.String audit3_username) {
		set("audit3_username", audit3_username);
	}
	
	public java.lang.String getAudit3Username() {
		return getStr("audit3_username");
	}
	
	public void setAudit1Name(java.lang.String audit1_name) {
		set("audit1_name", audit1_name);
	}
	
	public java.lang.String getAudit1Name() {
		return getStr("audit1_name");
	}
	
	public void setAudit2Name(java.lang.String audit2_name) {
		set("audit2_name", audit2_name);
	}
	
	public java.lang.String getAudit2Name() {
		return getStr("audit2_name");
	}
	
	public void setAudit3Name(java.lang.String audit3_name) {
		set("audit3_name", audit3_name);
	}
	
	public java.lang.String getAudit3Name() {
		return getStr("audit3_name");
	}
	
	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setBankaccountNum(java.lang.String bankaccount_num) {
		set("bankaccount_num", bankaccount_num);
	}

	public java.lang.String getBankaccountNum() {
		return get("bankaccount_num");
	}
	
	public void setBankaccountNumNum(java.lang.Integer bankaccount_num_num) {
		set("bankaccount_num_num", bankaccount_num_num);
	}

	public java.lang.Integer getBankaccountNumNum() {
		return get("bankaccount_num_num");
	}
	
	public void setBankaccountNumYear(java.lang.String bankaccount_num_year) {
		set("bankaccount_num_year", bankaccount_num_year);
	}

	public java.lang.String getBankaccountNumYear() {
		return get("bankaccount_num_year");
	}
	
	public void setBankaccountNumChildCompanyId(java.lang.String bankaccount_num_child_company_id) {
		set("bankaccount_num_child_company_id", bankaccount_num_child_company_id);
	}

	public java.lang.String getBankaccountNumChildCompanyId() {
		return get("bankaccount_num_child_company_id");
	}
}