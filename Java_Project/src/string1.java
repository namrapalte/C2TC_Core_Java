
public class string1 {


	public static void main(String[] args)
	
	{
		String s=new String("Farhat");// mutable object
		
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		String s1="MUMBAI";
		System.out.println(s1.equals("mumbai"));
		
		System.out.println(s1.equalsIgnoreCase("mumbai"));
		
		System.out.println(s1.replace('M', 'T'));
		
		System.out.println(s.trim());
		
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(3,8));
		

	}

}

