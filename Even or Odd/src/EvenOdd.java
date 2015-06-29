import java.util.Scanner;


public class EvenOdd 
{

	public static void main(String[] args)
	{
		System.out.println("Check whether number is odd or even");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		if((a%2)==0)
		{ System.out.println("The number is even");
		}
		else
		{	
           System.out.println("The number is odd"); 
		} 
		scan.close();
	}

}
