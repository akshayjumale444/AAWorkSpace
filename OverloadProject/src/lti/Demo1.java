package lti;

public class Demo1 {
	double balance=1000.00;
	   public void deposit(Double amount)
	   {
	     balance=balance+amount;
	      System.out.println(balance);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo1().deposit(5000.00);
		
		
	}

}
