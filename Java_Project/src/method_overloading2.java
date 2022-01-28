
public class method_overloading2 {



	public void m(Object o)
	{
		System.out.println("Object Class");
	}
	public void m(String s)
	{
		System.out.println("String Class");
	}
	public void m(StringBuffer s)
	{
		System.out.println("StringBuffer Class");
	}
	

public static void main(String[] args) {
		
	method_overloading2 obj=new method_overloading2();
		obj.m(new Object());
		
		obj.m("Maria");
	
		//obj.m(null);
		

	}

}
