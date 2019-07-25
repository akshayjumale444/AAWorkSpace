package lti;
// implemented class of an interface
public class Box implements Shape3d
{
	private double height,width,length;

	public Box() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public Box(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}


	@Override
	public void volume() 
	{
		// TODO Auto-generated method stub
		System.out.println("Volume is "+(length*width*height));
		
	}

	@Override
	public void area() 
	{
		// TODO Auto-generated method stub
		//considering cuboidal box
		double area;
		area=2*(length*width+length*height+width*height);
		System.out.println("Area is "+area);
		
	}

	
}
