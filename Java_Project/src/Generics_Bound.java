
class Sample <T extends Number>{
		   T data;
		   Sample(T data){
		      this.data = data;
		   }
		   public void display() {
		      System.out.println("Data value is: "+this.data);
		   }
		}
	public class Generics_Bound {
		   public static void main(String args[]) {
		      Sample<Integer> obj1 = new Sample<Integer>(20);
		      obj1.display();
		      Sample<Double> obj2 = new Sample<Double>(20.22d);
		      obj2.display();
		      Sample<Float> obj3 = new Sample<Float>(125.332f);
		      obj3.display();
		   }
		}

