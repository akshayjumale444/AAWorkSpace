package lti;

public class Demo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Employee.count);
		Employee.showCount();
		
		System.out.println("After creation of object");
		Employee e1=new Employee("Ram");
		e1.display();
		Employee.showCount();
		
		Employee e2=new Employee("Shyam");
		e2.display();
		Employee.showCount();

			
	}

}
