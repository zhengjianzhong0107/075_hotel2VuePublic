package com.etc.model;
public class Hinfo {
	private Integer hid;
	private String area;
	private String floor;
	private String window;
	private Integer bed;
	private String htext;
	private Integer tid;

	private String tname;

	public Hinfo (){}

	public String getTname() {
		return tname;
	}

	public Hinfo(Integer hid, String area, String floor, String window, Integer bed, String htext, Integer tid, String tname) {
		this.hid = hid;
		this.area = area;
		this.floor = floor;
		this.window = window;
		this.bed = bed;
		this.htext = htext;
		this.tid = tid;
		this.tname = tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getHid(){
		return hid;
	}
	public void setHid(Integer hid){
		this.hid = hid;
	}
	public String getArea(){
		return area;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getFloor(){
		return floor;
	}
	public void setFloor(String floor){
		this.floor = floor;
	}
	public String getWindow(){
		return window;
	}
	public void setWindow(String window){
		this.window = window;
	}
	public Integer getBed(){
		return bed;
	}
	public void setBed(Integer bed){
		this.bed = bed;
	}
	public String getHtext(){
		return htext;
	}
	public void setHtext(String htext){
		this.htext = htext;
	}
	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
	}
	public String toString(){
		return "Hinfo [hid=" + hid + ", area=" + area + ", floor=" + floor + ", window=" + window + ", bed=" + bed + ", htext=" + htext + ", tid=" + tid + "]";
	}
}
