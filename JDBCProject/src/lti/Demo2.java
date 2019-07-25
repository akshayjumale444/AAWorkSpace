package lti;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo2 
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
		
		//calling the procedure using CallableStatement
		CallableStatement cst=con.prepareCall("{call findbalance(?,?)}");
		cst.setInt(1,102);					//setting first parameter==>this value is sent to database
		cst.registerOutParameter(2, Types.DOUBLE);			//value received from the database		
		boolean ch=cst.execute();
		System.out.println("Procedure called successfully"+ch);
		
		double bal=cst.getDouble(2);
		System.out.println("Balance of accno 101 is Rs:"+bal);
		con.close();	
	}
}
