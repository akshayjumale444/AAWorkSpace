package lti;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		System.out.println("Name " +t1.getName());
		System.out.println("Priority "+t1.getPriority());
		System.out.println(" ID: "+t1.getId());
	
		
		for (int i=0;i<20;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
