package com.lti.bean;

public class ProCollege {
private int cid;
private String cname;
private String course;
private String city;
private double fees;
private int pin;


public ProCollege() {
	// TODO Auto-generated constructor stub
}


public ProCollege(int cid, String cname, String course, String city, double fees, int pin) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.course = course;
	this.city = city;
	this.fees = fees;
	this.pin = pin;
}


public int getCid() {
	return cid;
}


public void setCid(int cid) {
	this.cid = cid;
}


public String getCname() {
	return cname;
}


public void setCname(String cname) {
	this.cname = cname;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public double getFees() {
	return fees;
}


public void setFees(double fees) {
	this.fees = fees;
}


public int getPin() {
	return pin;
}


public void setPin(int pin) {
	this.pin = pin;
}


@Override
public String toString() {
	return "ProCollege [cid=" + cid + ", cname=" + cname + ", course=" + course + ", city=" + city + ", fees=" + fees
			+ ", pin=" + pin + "]";
}

}
