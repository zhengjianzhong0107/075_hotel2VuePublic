package com.etc.model;
public class Lianxi {
	private Integer lxid;
	private String name;
	private String email;
	private String yijian;
	private Integer temp;
	private String userid;

	public Lianxi(Integer lxid, String name, String email, String yijian, Integer temp, String userid) {
		this.lxid = lxid;
		this.name = name;
		this.email = email;
		this.yijian = yijian;
		this.temp = temp;
		this.userid = userid;
	}

	public Lianxi (){}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getLxid(){
		return lxid;
	}
	public void setLxid(Integer lxid){
		this.lxid = lxid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getYijian(){
		return yijian;
	}
	public void setYijian(String yijian){
		this.yijian = yijian;
	}
	public Integer getTemp(){
		return temp;
	}
	public void setTemp(Integer temp){
		this.temp = temp;
	}
	public String toString(){
		return "Lianxi [lxid=" + lxid + ", name=" + name + ", email=" + email + ", yijian=" + yijian + ", temp=" + temp + "]";
	}
}
