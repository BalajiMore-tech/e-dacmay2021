import java.util.Scanner;

class Question_12
{
	public static void main(String[] args) 				
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1=in.nextInt();
		
		System.out.print("Enter first number : ");
		int num2=in.nextInt();
		
		System.out.print("Enter first number : ");
		int num3=in.nextInt();

		System.out.println("Average : " + (num1+num2+num3)/3);
	}
}