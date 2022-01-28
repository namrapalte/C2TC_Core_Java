import java.util.Scanner;
public class throws_exc {
	

		public static void main(String[] args) throws CantVote
		{
		
			int Att;
			System.out.println("Enter the Attendance");
			Scanner s =new Scanner(System.in);
			Att=s.nextInt();
			
			if(Att<75)
			{
				throw new CantVote("You cannot seat in the Exam.....");
			}
			
			else
			{
				System.out.println("You are good to go .....");
			}

		}

	}

	class CantVote extends Exception    //Checked Exception
	{
		CantVote(String msg)
		{
			super(msg);
		}
	}

