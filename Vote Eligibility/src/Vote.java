import java.util.Scanner;


public class Vote {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Vote Eligibility");
		System.out.println("Enter your age:");
		int a = scan.nextInt();
		if (a>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		scan.close();
		
	}

}
