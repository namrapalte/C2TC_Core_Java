import java.util.Scanner;

public class pattern_exam2 {
	public static void main(String[] args)
    {
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N:");
	int n=sc.nextInt();
        System.out.println("## Printing the pattern ##");
        for (int i = n; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print( " *");
			}
			System.out.println();
		}
    }
}
