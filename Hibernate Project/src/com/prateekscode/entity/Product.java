package com.prateekscode.entity;

import java.io.Serializable;

//entity class, persistence class, domain class, model class
public class Product implements Serializable{
	
	//bean properties
	private int pid;
	private String pname;
	private float qty;
	private float price;
	
	//for dynamic generated queries it works on wrapper class not primitive.
	/*private Integer pid;
	private String pname;
	private Float qty;
	private Float price;*/
	
	
	//getters and setters
	public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getQty() {
			return qty;
		}
		public void setQty(float qty) {
			this.qty = qty;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
	
	//For dynamic generated queries it works on warpper classes
	
	/*	public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public Float getQty() {
			return qty;
		}
		public void setQty(Float qty) {
			this.qty = qty;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}*/
	

}
