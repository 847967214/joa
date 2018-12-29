package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAmsAssetRepair<M extends BaseAmsAssetRepair<M>> extends Model<M> implements IBean {

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

	public void setDes(java.lang.String des) {
		set("des", des);
	}
	
	public java.lang.String getDes() {
		return getStr("des");
	}

	public void setDamageTime(java.lang.String damageTime) {
		set("damage_time", damageTime);
	}
	
	public java.lang.String getDamageTime() {
		return getStr("damage_time");
	}

	public void setAssetId(java.lang.String assetId) {
		set("asset_id", assetId);
	}
	
	public java.lang.String getAssetId() {
		return getStr("asset_id");
	}

	public void setWillCost(java.lang.String willCost) {
		set("will_cost", willCost);
	}
	
	public java.lang.String getWillCost() {
		return getStr("will_cost");
	}

	public void setDamageDes(java.lang.String damageDes) {
		set("damage_des", damageDes);
	}
	
	public java.lang.String getDamageDes() {
		return getStr("damage_des");
	}

	public void setDamageReason(java.lang.String damageReason) {
		set("damage_reason", damageReason);
	}
	
	public java.lang.String getDamageReason() {
		return getStr("damage_reason");
	}

	public void setAssetname(java.lang.String assetName) {
		set("asset_name", assetName);
	}
	
	public java.lang.String getAssetName() {
		return getStr("asset_name");
	}
	
	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}
}
