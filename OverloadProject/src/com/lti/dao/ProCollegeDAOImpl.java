package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.ProCollege;
import com.lti.bean.Student;


public class ProCollegeDAOImpl implements ProCollegeDAO{
	private Connection con;

	@Override
	public boolean addCollege(ProCollege ob) {
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
				PreparedStatement ps1=con.prepareStatement("insert into college values(?,?,?,?,?,?)");
				ps1.setInt(1, ob.getCid());
				ps1.setString(2, ob.getCname());
				ps1.setString(3, ob.getCourse());
				ps1.setString(4, ob.getCity());
				ps1.setDouble(5, ob.getFees());
				ps1.setInt(6, ob.getPin());
				
			   
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
	public boolean displayCollege(ProCollege ob) {
		// TODO Auto-generated method stub
		List<ProCollege>acclist=new ArrayList<ProCollege>();
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
						
						PreparedStatement ps1=con.prepareStatement("select * from college where course=?");
						
						ResultSet rs=ps1.executeQuery();
						while(rs.next())
						{
							ProCollege ob = new ProCollege();
						
							ps1.setInt(1, ob.getCid());
							ps1.setString(2, ob.getCname());
							ps1.setString(3, ob.getCourse());
							ps1.setString(4, ob.getCity());
							ps1.setDouble(5, ob.getFees());
							ps1.setInt(6, ob.getPin());
							
							acclist.add(ob);
						
						}
						
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
	public boolean total() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCollege(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCollege(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProCollege> getAllCollege() {
		// TODO Auto-generated method stub
		return null;
	}

}
