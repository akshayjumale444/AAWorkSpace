
public class Demo3
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
		try
		{	
		withdrawamount=Double.parseDouble(args[0]);
		Demo3 ob=new Demo3();
		ob.withdraw(withdrawamount);
		}
	
		catch(Exception e)
		{
			System.out.println("Enter the amount in numeric!!!!!!! \n Message from exception "+e.getMessage());
		}
		System.out.println("Transaction Succesful!!!!");
	}

}
