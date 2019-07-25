package com.lti.service;

import java.util.List;

import com.lti.bean.ProCollege;

public interface ProCollegeService {
	public boolean addCollege(ProCollege ob);
	public boolean displayCollege(ProCollege ob);
	public boolean total();
	public boolean updateCollege(int cid);
	public boolean deleteCollege(int cid);
	

	public List<ProCollege>getAllCollege();

}
