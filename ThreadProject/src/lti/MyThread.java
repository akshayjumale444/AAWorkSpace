package lti;

public class MyThread extends Thread
{
	//
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("Executing run from subclass MyThread");
		try 
		{
			Thread.sleep(1000);
			
		}
		catch (InterruptedException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("My Thread Exiting");
	}
}
