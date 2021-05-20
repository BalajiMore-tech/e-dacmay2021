import java.util.Scanner;

public class Question_9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No. of Days : ");
		int n = sc.nextInt();
		
		int year = n / 365;
		int day = n % 365;
		int month = day / 30;
		day = day % 30;
		int week = day / 7;
		day = day % 7;
		
		System.out.println("No. of Years : " + year);
		System.out.println("No. of Months : " + month);
		System.out.println("No. of Weeks : " + week);
		System.out.println("No. of Days : " + day);
	}
}