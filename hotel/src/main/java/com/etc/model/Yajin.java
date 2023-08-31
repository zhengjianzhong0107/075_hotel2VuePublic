package com.etc.model;
public class Yajin {
	private String oid;
	private Integer hid;
	private String money;
	private Integer type;
	private Integer zt;
	private String stime;
	private String ttime;
	public Yajin (){}
	public Yajin (String oid,Integer hid,String money,Integer type,Integer zt,String stime,String ttime){
		this.oid = oid;
		this.hid = hid;
		this.money = money;
		this.type = type;
		this.zt = zt;
		this.stime = stime;
		this.ttime = ttime;
	}
	public String getOid(){
		return oid;
	}
	public void setOid(String oid){
		this.oid = oid;
	}
	public Integer getHid(){
		return hid;
	}
	public void setHid(Integer hid){
		this.hid = hid;
	}
	public String getMoney(){
		return money;
	}
	public void setMoney(String money){
		this.money = money;
	}
	public Integer getType(){
		return type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	public Integer getZt(){
		return zt;
	}
	public void setZt(Integer zt){
		this.zt = zt;
	}
	public String getStime(){
		return stime;
	}
	public void setStime(String stime){
		this.stime = stime;
	}
	public String getTtime(){
		return ttime;
	}
	public void setTtime(String ttime){
		this.ttime = ttime;
	}
	public String toString(){
		return "Yajin [oid=" + oid + ", hid=" + hid + ", money=" + money + ", type=" + type + ", zt=" + zt + ", stime=" + stime + ", ttime=" + ttime + "]";
	}
}
