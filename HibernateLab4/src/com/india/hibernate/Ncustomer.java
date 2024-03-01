package com.india.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Ncustomer")
public class Ncustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;

	@Column(name="cname")
	private String cname;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="phone")
	private long phone;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="myaddId")
	private Address address;

	public Ncustomer() {

	}

	public Ncustomer(String cname, String dob, long phone) {

		this.cname = cname;
		this.dob = dob;
		this.phone= phone;
	}

	public Ncustomer(int cid, String cname, String dob, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dob = dob;
		this.phone = phone;
	}

	public int getSid() {
		return cid;
	}

	public void setSid(int sid) {
		this.cid = sid;
	}

	public String getSname() {
		return cname;
	}

	public void setSname(String sname) {
		this.cname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Ncustomer [cid=" + cid + ", cname=" + cname + ", dob=" + dob + ", phone=" + phone + ", address="
				+ address + "]";
	}

}
