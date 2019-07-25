package lti;

public class Demo4 
{

	public static void main(String[] args) 
	{
		MyTransaction2 r=new MyTransaction2();		//runnable object
		Thread t1=new Thread(r,"Ram");
		Thread t2=new Thread(r,"Sham");
		Thread t3=new Thread(r,"Krishnaa");
		//start the thread
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); //tell t1 thread complete the task and come back
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Exiting main");

	}

}
