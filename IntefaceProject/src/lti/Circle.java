package lti;
//implemented class of an interface
public class Circle implements Shape
{
	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}

	@Override
	public void area() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Area of circle "+Shape.PI*radius*radius);
	}
	
}
