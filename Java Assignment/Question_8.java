import java.util.Scanner;

public class Question_8 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principle Amount : ");
		float P = sc.nextFloat();
		
		System.out.print("Enter Rate of Interst : ");
		float R = sc.nextFloat();
		
		System.out.print("Enter Time in Years: ");
		float T = sc.nextFloat();
		
		float SI = (float)(P * R * T) / 100;   
		System.out.println("Simple Interest is : " + SI);  
	}
}