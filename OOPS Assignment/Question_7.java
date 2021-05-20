import java.util.Scanner;

public class Question_7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of English : ");
		int Eng = sc.nextInt();
		
		System.out.print("Enter marks of Maths : ");
		int Math = sc.nextInt();
		
		System.out.print("Enter marks of Physics : ");
		int Phy = sc.nextInt();
		
		System.out.print("Enter marks of Chemistry : ");
		int Che = sc.nextInt();
		
		System.out.print("Enter marks of Computer : ");
		int Comp = sc.nextInt();
		
		double Total = Eng + Math + Phy + Che + Comp;
		double Percentage = (Total / 500) * 100;
		
		System.out.print("Percentage marks = " + Percentage + "%");
	}
}
