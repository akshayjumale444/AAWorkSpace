package com.lti.bean;
import java.sql.Date;

public class People 
{
	private int id;
	private String fname;
	private String lname;
	private Date dob;
	private String city;
	
	public People() 
	{
		// TODO Auto-generated constructor stub
	}

	public People(int id, String fname, String lname, Date dob, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", city=" + city + "]";
	}
	
	
}

