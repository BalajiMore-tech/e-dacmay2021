import java.util.Scanner;

public class Question_13 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First No : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second No : ");
		int b = sc.nextInt();
		
		System.out.print("Enter Third No : ");
		int c = sc.nextInt();
		
		if((a>=b) && (a>=c))
			System.out.println(a +  " is the largest number ");
		
		else if((b>=a) && (b>=c))
			System.out.println(b +  " is the largest number ");
		
		else
			System.out.print(c +  " is the largest number ");
	}
}