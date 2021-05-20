public class Question_3 
{
	public static void main(String[] args)
	{
		int x = 5;
		System.out.println("x = " + x);
		
		int y = x*x + 3*x - 7;
		System.out.println("A. y = " + y);
		
		y = x++ + ++x;
		System.out.println("B. x = " + x + " and y = " + y);
		
		int z = x++ - --y - --x + x++;
		System.out.println("C. x = " + x + ", y = " + y + " and z = " + z);
		
		boolean a = true;
		boolean b = false;
		boolean c = a && b || !(a || b);
		System.out.println("D. z = " + c);		
	}
}