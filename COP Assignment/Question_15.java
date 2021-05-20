import java.util.Scanner;

class Question_15
{
	public static void main(String[] args)
	{
		int a=10, b=20, temp;
		
		System.out.print("Before Swapping : a = " +a);
		System.out.println("\t b = " +b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.print("After Swapping : a = " +a);
		System.out.println("\t b = " +b);
	}
}