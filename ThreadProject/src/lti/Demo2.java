package lti;

public class Demo2 
{

	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();		//generate new thread object
		
		//start the thread
		t1.start();
		System.out.println("Exiting main");

	}

}
