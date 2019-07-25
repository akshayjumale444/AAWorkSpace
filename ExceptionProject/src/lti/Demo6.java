package lti;
import java.io.*;

public class Demo6
{
	
	public double readfromConsole() throws IOException
	{
		String s_sal="";
		double sal=0.0;
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		s_sal=br.readLine();
		sal=Double.parseDouble(s_sal);
		br.close();
		return sal;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double withdrawamount=0.0;
		try
		{	
		Demo6 ob=new Demo6();
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
