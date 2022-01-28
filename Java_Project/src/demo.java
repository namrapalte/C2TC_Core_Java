
public class demo {

	int roll;
	String name;
    static String college="Mumbai University";
	
	
	demo(int r, String n){  
		   roll = r;  
		   name = n;  
		   }  
	static void change()
	{
		college="Doon University";
	}

	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		
		demo.change();
	
		demo s1=new demo(1,"Alisha");
		demo s2=new demo(2,"Anusha");
		s1.display();
		s2.display();
	

	
	}

}
