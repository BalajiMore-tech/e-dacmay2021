import java.util.Scanner;

public class Question_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double bs, gs, da, hra;
		
		System.out.println("Enter Basic Salary : ");
		bs = sc.nextDouble();
		
		if(bs  < 10000)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
		
		else
		{
			hra = 2000;
			da = bs * 98 / 100;
		}
		
		gs = bs + hra + da;
		System.out.println("Gross Salary : " + gs);
		
	}
}
