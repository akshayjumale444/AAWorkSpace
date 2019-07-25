package lti;

public class Demo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle c=new Circle(15.12);
		c.area();
		
		Box b=new Box(5,7,6);
		b.area();
		b.volume();
		
		
		Shape s;
		s=c;			//interface Shape points to circle object
		s.area();
		
		s=b;			//interface Shape points to box object
		s.area();
		
		Shape3d sd;
		sd=b;
		sd.volume();
		sd.area();

	}

}
