package com.lti.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.People;

public class PeopleDAOImpl implements PeopleDAO
{
	private Connection con;

	@Override
	public boolean insertmember(People ob) 
	{
		boolean inserted=false;
		// Load Driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// Establish connection using url, username and password
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String username="hr";
				String password="hr";
				
				try
				{
				//establish connection
				con=DriverManager.getConnection(url,username,password);
				System.out.println("Connected");
				
				//parametrized query
				PreparedStatement ps1=con.prepareStatement("insert into People values(?,?,?,?,?)");
				ps1.setInt(1, ob.getId());
				ps1.setString(2, ob.getFname());
				ps1.setString(3,ob.getLname());
				
				Date d=ob.getDob();
				//Date d=Date.valueOf(d);
				ps1.setDate(4,d );
				ps1.setString(5, ob.getCity());
			   
				int i=ps1.executeUpdate();
				System.out.println("Records inserted are: "+i);
				
				inserted=true; 
				}
				catch(SQLException e)
					{
					System.out.println(e.getMessage());
					inserted=false;
					}
				finally
				{
				try 
					{
					con.close();
					} 
				catch (SQLException e) 
					{
					e.printStackTrace();
					}	
				}
		return inserted;
	}



	@Override
	public boolean updatemember(String city) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletemember(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<People> getAllmembers() {
		// TODO Auto-generated method stub
		List<People>acclist=new ArrayList<People>();
		// Load Driver
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// Establish connection using url, username and password
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String username="hr";
				String password="hr";
				
				try
				{
				//establish connection
				con=DriverManager.getConnection(url,username,password);
				System.out.println("Connected");
				
				//parametrized query
				PreparedStatement ps1=con.prepareStatement("select * from account");
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					People ob = new People();
					int id=rs.getInt(1);
					ob.setId(id);;
					ob.setFname(rs.getString(2));
					ob.setLname(rs.getString(3));
					ob.setDob(rs.getDate(4));
					ob.setCity(rs.getString(5));
					acclist.add(ob);
				
				}
				
				}
				catch(SQLException e)
					{
					System.out.println(e.getMessage());
				
					}
				finally
				{
				try 
					{
					con.close();
					} 
				catch (SQLException e) 
					{
					e.printStackTrace();
					}	
				}
		return acclist;
	
	}

	@Override
	public boolean display_member_of_city() 
	{
		// TODO Auto-generated method stub
		
		return false;
	}

}
