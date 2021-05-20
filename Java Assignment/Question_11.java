public class Question_11 
{
	public static void main(String[] args)
	{
		System.out.println("Before Swapping : ");
		int x = 10;
		int y = 20;
		
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		
		System.out.println("After Swapping : ");
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
	}
}