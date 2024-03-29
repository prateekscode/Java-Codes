package com.india.hibernate;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "Studentss")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;

	private String sname;
	private String dob;
	private String qualification;

	@CollectionOfElements
	@JoinTable(name = "courses", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private String[] courses;

	@CollectionOfElements
	@JoinTable(name = "skills", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private List<String> skills;

	@CollectionOfElements
	@JoinTable(name = "marks", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private List<Integer> marks;

	@CollectionOfElements
	@JoinTable(name = "refs", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private Map<String, Long> refs;

	public Student() {

	}

	public Student(String sname, String dob, String qualification) {

		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
	}

	public Student(int sid, String sname, String dob, String qualification) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] couurses) {
		this.courses = couurses;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}


}
