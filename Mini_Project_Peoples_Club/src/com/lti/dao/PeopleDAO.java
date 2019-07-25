package com.lti.dao;

import java.util.List;
import com.lti.bean.*;

public interface PeopleDAO 
{
	public boolean insertmember(People ob);
	public boolean display_member_of_city();
	public boolean updatemember(String city);
	public boolean deletemember(int id);
	
	public List <People> getAllmembers();
}
