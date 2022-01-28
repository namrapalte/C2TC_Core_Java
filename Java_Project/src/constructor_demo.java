import java.util.*;
public class constructor_demo {
	
	String name;
	int roll;
	
	constructor_demo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		constructor_demo s1=new constructor_demo("Arman",101);
		constructor_demo s2= new constructor_demo("Naaz",102);
		
		
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);

	}

}

