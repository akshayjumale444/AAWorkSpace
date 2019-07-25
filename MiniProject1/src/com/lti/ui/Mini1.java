package com.lti.ui;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Student;
import com.lti.service.StudentService;
import com.lti.service.StudentServiceImpl;

public class Mini1  {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		StudentService service=new StudentServiceImpl();
		
		Student ob=new Student(7,"jlkjh","hkjqweg","IT","FAIL");
		
	//	service.addStudent(ob);
		//service.deleteStudent(ob);
		//service.SearchStudent(3);
		//service.SearchStudentFail("FAIL");
		List <Student >alist=service.getAllStudent();
		
	for(Student a:alist)
		{
			System.out.println(a);
			System.out.println("------------------------------------------------------");
		}
		

	}

}
