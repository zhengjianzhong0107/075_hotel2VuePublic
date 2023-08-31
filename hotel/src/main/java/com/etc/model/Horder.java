package com.etc.model;
public class Horder {
	private String oid;
	private String userid;
	private Integer tid;
	private String otime;
	private String starttime;
	private String endtime;
	private Integer days;
	private Integer total;
	private String beizhu;
	private String lxname;
	private String lxtel;
	private String lccard;
	private Integer state;


	private String image;
	private String tname;

	public Horder(String oid, String userid, Integer tid, String otime, String starttime, String endtime, Integer days, Integer total, String beizhu, String lxname, String lxtel, String lccard, Integer state, String image, String tname) {
		this.oid = oid;
		this.userid = userid;
		this.tid = tid;
		this.otime = otime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.days = days;
		this.total = total;
		this.beizhu = beizhu;
		this.lxname = lxname;
		this.lxtel = lxtel;
		this.lccard = lccard;
		this.state = state;
		this.image = image;
		this.tname = tname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Horder (){}


	public String getOid(){
		return oid;
	}
	public void setOid(String oid){
		this.oid = oid;
	}
	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid = userid;
	}
	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
	}
	public String getOtime(){
		return otime;
	}
	public void setOtime(String otime){
		this.otime = otime;
	}
	public String getStarttime(){
		return starttime;
	}
	public void setStarttime(String starttime){
		this.starttime = starttime;
	}
	public String getEndtime(){
		return endtime;
	}
	public void setEndtime(String endtime){
		this.endtime = endtime;
	}
	public Integer getDays(){
		return days;
	}
	public void setDays(Integer days){
		this.days = days;
	}
	public Integer getTotal(){
		return total;
	}
	public void setTotal(Integer total){
		this.total = total;
	}
	public String getBeizhu(){
		return beizhu;
	}
	public void setBeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	public String getLxname(){
		return lxname;
	}
	public void setLxname(String lxname){
		this.lxname = lxname;
	}
	public String getLxtel(){
		return lxtel;
	}
	public void setLxtel(String lxtel){
		this.lxtel = lxtel;
	}
	public String getLccard(){
		return lccard;
	}
	public void setLccard(String lccard){
		this.lccard = lccard;
	}
	public Integer getState(){
		return state;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public String toString(){
		return "Horder [oid=" + oid + ", userid=" + userid + ", tid=" + tid + ", otime=" + otime + ", starttime=" + starttime + ", endtime=" + endtime + ", days=" + days + ", total=" + total + ", beizhu=" + beizhu + ", lxname=" + lxname + ", lxtel=" + lxtel + ", lccard=" + lccard + ", state=" + state + "]";
	}
}
