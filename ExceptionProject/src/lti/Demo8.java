package lti;
import java.io.*;

public class Demo8
{
	
	public double readfromConsole() throws IOException
	{
		String s_sal="";
		double sal=0.0;
		// try with resources
		//generate resource object with try with resources
		// the close() method will be called automatically before it leaves try block
		
		try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in)))
		{
		s_sal=br.readLine();
		sal=Double.parseDouble(s_sal);
		// close() method of br will be called automatically
		
		}
		catch(IOException| NumberFormatException e) // new syntax jdk 1.7 onwards
		{
			System.out.println(e.getMessage());
			throw e;
		}
		
		return sal;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double withdrawamount=0.0;
		try
		{	
		Demo8 ob=new Demo8();
		ob.readfromConsole();
		}
		catch(Exception e)
		{
			System.out.println("Enter the amount in numeric!!!!!!! \n Message from exception "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("END");
	}

}
