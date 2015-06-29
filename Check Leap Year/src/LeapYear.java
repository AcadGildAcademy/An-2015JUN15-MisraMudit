import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) 
	{
		System.out.println("Check whether year is a leap year or not");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int a = scan.nextInt();
		if((a%100)==0)
		{ if((a%400)==0)
		  {
			System.out.println(a+" "+"is a leap year");
		  }
		else
		  { System.out.println(a+" "+"is not a leap year");
		
		  }
		}
		else if((a%4)==0)
		{ 
			System.out.println(a+" "+"is a leap year");
		
		}
		else
		{
			System.out.println(a+" "+"is not a leap year");
		}
		scan.close();
	}

}
