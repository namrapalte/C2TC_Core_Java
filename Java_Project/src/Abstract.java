import java.util.*;
	
	abstract class An {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}
	class Pig extends An {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Abstract {
	  public static void main(String[] args) {
	    Pig myPig = new Pig(); // Create a Pig object
	    myPig.animalSound();
	    
	  }
	}
	