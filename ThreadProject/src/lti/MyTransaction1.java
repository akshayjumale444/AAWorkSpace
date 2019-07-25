package lti;

public class MyTransaction1 implements Runnable 
{
	@Override
	public void run() 
	{
		System.out.println("Executing run from subclass MyTransaction1");
		try 
		{
			Thread.sleep(1000);	
		}
		catch (InterruptedException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("MyTransaction1 Exiting");
		
	}

}
