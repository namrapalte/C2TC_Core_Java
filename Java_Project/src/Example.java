import java.util.Scanner;

public class Example {
	public static void main(String[] args)
    {
	    int i,j,k;
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter Pattern length: ");  
	    int n= sc.nextInt();  

	for(int t = 0; t<n;  t++ ){
	    for(i=n;i>=1;i--){
			    for(j=1;j<=n-i;j++){
	                     System.out.print(" ");
			    }
			    for(k=1;k<=n;k++){
			        System.out.print(" * ");
			}
			 System.out.println(" ");
		    }
	}
	    }
	}
