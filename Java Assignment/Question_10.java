import java.util.Scanner;

public class Question_10 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Fahrenheit : ");
		double f = sc.nextDouble();
		double c = 5 * (f - 32) / 9;
		
		System.out.println("Temperature in Celcius : " + c);
	}
}
