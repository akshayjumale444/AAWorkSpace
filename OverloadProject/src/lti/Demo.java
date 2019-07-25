package lti;

public class Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test ob=new Test();
		ob.add("12","34");
		ob.add(10, 20);
		ob.add(10, 20,30);
		int p[]= {10,20,30,40,50,60};
		ob.add(p);
		
		//Overloaded methods
		//same method name
		//same return type
		//differs in parameter list
		//-->either by number of parameter
		//-->sequence of parameter
		//-->data type of parameter
	}

}
