
public class Demo4
{
	double balance=10000.00;
	
	public void withdraw(double amount) throws Exception
	{
		double bal=balance;
		balance=balance-amount;
		if(balance<1000.00)
		{
			balance=bal;
//			throw new RuntimeException("Insufficient Fund"); //Unchecked Exception
			throw new Exception("Insufficient Fund");
		}
		System.out.println("After withdraw balance is "+balance);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double withdrawamount=0.0;
		try
		{	
		withdrawamount=Double.parseDouble(args[0]);
		Demo4 ob=new Demo4();
		ob.withdraw(withdrawamount);
		}
		catch(Exception e)
		{
			System.out.println("Enter the amount in numeric!!!!!!! \n Message from exception "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Transaction Succesful!!!!");
	}

}
