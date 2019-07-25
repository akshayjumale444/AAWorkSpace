package lti;

public class Demo2
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
		Demo2 ob=new Demo2();
		ob.withdraw(withdrawamount);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Please enter amount");
			a.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter the amount in numeric Message from exception "+e.getMessage());
		}
		System.out.println("Transaction Succesful!!!!");
	}

}
