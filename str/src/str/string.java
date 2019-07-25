package str;

public class string
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Q1
		String s1=new String("LTI");
		String s2=new String("LTI");
		System.out.println(s1==s2);
		
		//Q2
		String s3="LTI";
		String s4="LTI";
		System.out.println(s3==s4);
		
		//Q3
		String s5=new String("LTI");
		String s6=new String("LTI");
		System.out.println(s5.equals(s6));
		
		//Q4
		String s="Larsen ";
		s=s+"and Tourbro Infotech";
		System.out.println(s);
		
		//Q5
		StringBuffer str=new StringBuffer("Larsen");
		str=str.append("and Toubro Infotech using StringBuffer");
		System.out.println(str);
		
		
	}

}
