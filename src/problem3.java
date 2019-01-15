import java.util.*;
class problem3
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("enter a floating type value:");
		x=input.nextDouble();
		System.out.println("enter anather floating type value:");
		y=input.nextDouble();
		    x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;
        if(x==y)
        {
        	System.out.println("the decimal places are equal");
        } 
        else{
        	System.out.println("the decimal places are unequal");
        }
	}
}