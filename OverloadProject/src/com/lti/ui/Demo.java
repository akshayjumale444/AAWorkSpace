package com.lti.ui;

import com.lti.bean.ProCollege;

import com.lti.service.ProCollegeService;
import com.lti.service.ProCollegeServiceImpl;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ProCollegeService service=new ProCollegeServiceImpl();
		
		ProCollege ob=new ProCollege(1,"Anurag","COMP","NAGPUR",1234.56,4419);
		service.addCollege(ob);

	}

}
