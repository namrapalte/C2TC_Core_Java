import java.util.Scanner;
public class Pattern_exam3 {
	public static void main(String[] args)
    {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N:");
	int n=sc.nextInt();

        System.out.println("## Printing the pattern ##");


		for (int i = 1 ; i <= n; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 
			{
				System.out.print("*");
			}
			for (int k = 1 ; k <= 2 * (n - i); k++ ) 
			{
				System.out.print(" ");
			}
			for (int l = 1 ; l <= i; l++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

