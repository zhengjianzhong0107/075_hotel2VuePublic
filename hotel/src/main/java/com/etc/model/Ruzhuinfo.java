package com.etc.model;
public class Ruzhuinfo {
	private Integer id;
	private String name;
	private String idcard;
	private String mobile;
	private String oid;
	public Ruzhuinfo (){}
	public Ruzhuinfo (Integer id,String name,String idcard,String mobile,String oid){
		this.id = id;
		this.name = name;
		this.idcard = idcard;
		this.mobile = mobile;
		this.oid = oid;
	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getIdcard(){
		return idcard;
	}
	public void setIdcard(String idcard){
		this.idcard = idcard;
	}
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getOid(){
		return oid;
	}
	public void setOid(String oid){
		this.oid = oid;
	}
	public String toString(){
		return "Ruzhuinfo [id=" + id + ", name=" + name + ", idcard=" + idcard + ", mobile=" + mobile + ", oid=" + oid + "]";
	}
}
