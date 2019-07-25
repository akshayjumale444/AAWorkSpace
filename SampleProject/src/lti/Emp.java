package lti;

public class Emp {
	int eid;
	String ename;
public Emp() {
	// TODO Auto-generated constructor stub
}
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
public void setEid(int eid) {
	this.eid = eid;
}
@InfoAnnotation(value=1,name="Info of emp")
public void display()
{
	System.out.println(eid+" "+ename);
}
}
