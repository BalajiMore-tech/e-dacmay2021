import java.util.Scanner;

public class Question_15 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Gender (M/F) : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("Enter the Age : ");
		int a = sc.nextInt();
		
		if((ch == 'M') && (a > 21))
		{
			System.out.println("Congrats! You are eligible for Marriage");
		}
		
		else if((ch == 'F') && (a > 18))
		{
			System.out.println("Congrats! You are eligible for Marriage");
		}
		
		else
			System.out.println("Sorry! You are not eligible for Marriage");
	}
}