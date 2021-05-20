import java.util.Scanner;

public class Question_6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of a Circle : ");
		double radius = sc.nextDouble();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle : " + area);
		
		double circumference = Math.PI * 2 * radius;
		System.out.println("Circumference of Circle : " + circumference);
	}
}
