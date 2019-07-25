package com.lti.service;

import java.util.List;

import com.lti.bean.ProCollege;
import com.lti.dao.ProCollegeDAO;
import com.lti.dao.ProCollegeDAOImpl;

public class ProCollegeServiceImpl implements ProCollegeService {
	private ProCollegeDAO dao=new ProCollegeDAOImpl();

	@Override
	public boolean addCollege(ProCollege ob) {
		// TODO Auto-generated method stub
		return dao.addCollege(ob);
	}

	@Override
	public boolean displayCollege(ProCollege ob) {
		// TODO Auto-generated method stub
		return dao.displayCollege(ob);
	}

	@Override
	public boolean total() {
		// TODO Auto-generated method stub
		return dao.total();
	}

	@Override
	public boolean updateCollege(int cid) {
		// TODO Auto-generated method stub
		return dao.updateCollege(cid);
	}

	@Override
	public boolean deleteCollege(int cid) {
		// TODO Auto-generated method stub
		return dao.deleteCollege(cid);
	}

	@Override
	public List<ProCollege> getAllCollege() {
		// TODO Auto-generated method stub
		return dao.getAllCollege();
	}

}
