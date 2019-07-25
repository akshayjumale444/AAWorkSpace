package com.lti.service;

import java.util.List;
import com.lti.bean.People;
import com.lti.dao.PeopleDAO;
import com.lti.dao.PeopleDAOImpl;

public class PeopleServiceImpl implements PeopleService 
{
	private PeopleDAO dao=new PeopleDAOImpl();

	@Override
	public boolean insertmember(People ob) {
		// TODO Auto-generated method stub
		return dao.insertmember(ob);
	}

	@Override
	public boolean display_member_of_city() {
		// TODO Auto-generated method stub
		return dao.display_member_of_city();
	}

	@Override
	public boolean updatemember(String city) {
		// TODO Auto-generated method stub
		return dao.updatemember(city);
	}

	@Override
	public boolean deletemember(int id) {
		// TODO Auto-generated method stub
		return dao.deletemember(id);
	}

	@Override
	public List<People> getAllmembers() {
		// TODO Auto-generated method stub
		return dao.getAllmembers();
	}



}
