
public class Demo1
{
	double balance=10000.00;
	
	public void withdraw(double amount)
	{
		double bal=balance;
		balance=balance-amount;
		System.out.println("After withdraw balance is "+balance);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double withdrawamount=0.0;
		withdrawamount=Double.parseDouble(args[0]);
		Demo1 ob=new Demo1();
		ob.withdraw(withdrawamount);
		
		System.out.println("Transaction Succesful!!!!");
	}

}
