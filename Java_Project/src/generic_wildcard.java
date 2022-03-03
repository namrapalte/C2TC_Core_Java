import java.util.ArrayList;
import java.util.List;

public class generic_wildcard {
	
	        public static void main(String[] args) 
	        {
	            List<Integer> integerList = new ArrayList<Integer>();
	            integerList.add(3); 
	            integerList.add(5); 
	            integerList.add(10);
	          //  print(integerList);
	            
	            List<String> stringList = new ArrayList<String>();
	            stringList.add("Arman"); 
	            stringList.add("Namra"); 
	            stringList.add("Ruchita"); 
	            print(stringList);
	           
	        }
	        public static void print(List<? extends String> list) 
	        //public static void print(List<? extends Number> list) 
	        {
	        	for(String input : list)
	           // for(Number input : list)
	            {
	                System.out.print(input +" ");
	            }            
	        }
	}

