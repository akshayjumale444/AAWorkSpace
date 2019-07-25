package lti;
import java.io.*;

public class Demo7
{
	
	public double readfromConsole() throws IOException
	{
		String s_sal="";
		double sal=0.0;
		BufferedReader br=null;
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		s_sal=br.readLine();
		sal=Double.parseDouble(s_sal);
		}
		catch(IOException| NumberFormatException e)
		{
			System.out.println(e.getMessage());
			throw e;
		}
		finally
		{
			System.out.println("Finally in method readfromConsole");
			br.close();
		}
		
		return sal;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double withdrawamount=0.0;
		try
		{	
		Demo7 ob=new Demo7();
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
