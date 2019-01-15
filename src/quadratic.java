import java.util.*;

class quadratic
{
	public static void main (String arg[])
	{
		
		Scanner input = new Scanner(System.in);
		double a,b,c,res,r1,r2;
		System.out.print("a=");
		a= input.nextDouble();
		System.out.println(a);
		System.out.print("b=");
		b= input.nextDouble();
		System.out.println(b);
		System.out.print("c=");
		c= input.nextDouble();
		System.out.println(c);
        res= b*b-4*a*c;
        if(res>0)
        {
         r1= (-b + Math.pow(res, 0.5)) / (2.0 * a);
         r2= (-b - Math.pow(res, 0.5)) / (2.0 * a);
         System.out.println("rootss are" +r1 +"and" +r2 );
        }
        if(res==0);
        {
        	r1=-b / (2.0 * a);
        	System.out.println("root is"+r1);

        }
     if(res<0)
        {
        	System.out.println("the quaratic equation has not real roots");
        }


	}
}