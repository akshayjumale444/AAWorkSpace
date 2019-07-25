package lti;
import java.lang.reflect.*;
public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Emp ob=new Emp(100,"King");
		Class empclass=ob.getClass();
		System.out.println("ClassName"+empclass.getName());
		System.out.println("-------------------------------");
		Method meth[]=empclass.getMethods();
		System.out.println("Methods are:");
		for(Method m:meth)
		{
			System.out.println(m.getName());
			System.out.println("No of Parameters are"+m.getParameterCount());
			Parameter pr[]=m.getParameters();
			for(Parameter p:pr)
			{
				System.out.println("-->Parameter is"+p.getName()+" > Type is "+p.getType().getName());
			}
			if(m.getName().equals("display"))
			{
				if(m.isAnnotationPresent(InfoAnnotation.class))
				{
					System.out.println("Annotation is present");
				}
				InfoAnnotation iano=m.getAnnotation(InfoAnnotation.class);
				System.out.println("Annotation values are"+iano.value()+","+iano.name());
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("Constructor are:");
		Constructor<Emp> con[]=empclass.getConstructors()
;
		for(Constructor<Emp> c:con)
		{
			System.out.println("=>"+c.getName());
			Parameter conp[]=c.getParameters();
			for(Parameter p:conp)
			{
				System.out.println("->Parameter is"+p.getName()+"> Type is"+p.getType().getName());
			}
		}

	}

}
