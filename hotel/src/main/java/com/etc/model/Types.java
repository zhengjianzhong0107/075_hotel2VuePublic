package com.etc.model;
public class Types {
	private Integer tid;
	private String tname;
	private String image;
	private String ttext;
	private Integer price;
	private String area;
	private String bed;
	private String weiyu;
	private Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Types (){}

	public Types(Integer tid, String tname, String image, String ttext, Integer price, String area, String bed, String weiyu, Integer num) {
		this.tid = tid;
		this.tname = tname;
		this.image = image;
		this.ttext = ttext;
		this.price = price;
		this.area = area;
		this.bed = bed;
		this.weiyu = weiyu;
		this.num = num;
	}

	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
	}
	public String getTname(){
		return tname;
	}
	public void setTname(String tname){
		this.tname = tname;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getTtext(){
		return ttext;
	}
	public void setTtext(String ttext){
		this.ttext = ttext;
	}
	public Integer getPrice(){
		return price;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	public String getArea(){
		return area;
	}
	public void setArea(String area){
		this.area = area;
	}
	public String getBed(){
		return bed;
	}
	public void setBed(String bed){
		this.bed = bed;
	}
	public String getWeiyu(){
		return weiyu;
	}
	public void setWeiyu(String weiyu){
		this.weiyu = weiyu;
	}
	public String toString(){
		return "Types [tid=" + tid + ", tname=" + tname + ", image=" + image + ", ttext=" + ttext + ", price=" + price + ", area=" + area + ", bed=" + bed + ", weiyu=" + weiyu + "]";
	}
}
