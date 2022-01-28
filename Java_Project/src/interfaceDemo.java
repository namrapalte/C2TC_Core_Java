
	
	public class interfaceDemo implements Animal {

	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }

	   public static void main(String args[]) {
		   interfaceDemo m = new interfaceDemo();
	      m.eat();
	      m.travel();
	   }
	} 

