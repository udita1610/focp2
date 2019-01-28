import java.util.*;
class Try2
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n,m, num;
		System.out.println("enter the value of n and m: ");
		n=input.nextInt();
		m=input.nextInt();
		try
		{
			num=n/m;

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}