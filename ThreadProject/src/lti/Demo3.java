package lti;

public class Demo3 
{

	public static void main(String[] args) 
	{
		MyTransaction1 r=new MyTransaction1();		//runnable object
		Thread t1=new Thread(r,"Ram");
		//start the thread
		t1.start();
		System.out.println("Exiting main");

	}

}
