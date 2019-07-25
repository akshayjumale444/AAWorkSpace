package lti;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo1 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		// Load Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Establish connection using url, username and password
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		
		//establish connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connected");
		Statement st=con.createStatement(); //generate Statement to execute sql
		ResultSet rs=st.executeQuery("select * from account");
		//List <PAccount>list=new ArrayList<PAccount>();
		System.out.println(" ID\tNAME\t\tDOJ\t\tSALARY");
		while(rs.next()) // goes to next record if exists and returns true
		{
			int id=rs.getInt("aid");
			String n=rs.getString("aname");
			LocalDate d=rs.getDate(3).toLocalDate();
			double bal=rs.getDouble(4);
			System.out.println(id+"\t"+n+"\t"+d+"\t"+bal);
			
			//list.add(0, new PAccount(rs.getInt(1),rs.getString(2),rs.getDate(3).toLocalDate(),rs.getDouble(4)));
			//System.out.println("==================================");
		}
		/*for(PAccount x:list)
		{
			System.out.println(x);
		}*/
		con.close();	
	}
}
