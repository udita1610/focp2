import java.util.*;
class Try3
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n,m, num;
		//System.out.println("enter the value of n and m: ");
		//n=input.nextInt();
		//m=input.nextInt();
		try
		{
			//num=n/m;
			//int array[5]=new int[5];
			 int a[]=new int[10];
            //Array has only 10 elements
              a[11] = 9;

                num=Integer.parseInt ("XYZ") ;
	           System.out.println(num);

	           String str=null;
		      System.out.println (str.length());


		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		 catch(ArrayIndexOutOfBoundsException e) 
		{
         System.out.println ("ArrayIndexOutOfBounds");
        }
        catch(NumberFormatException e)
       {
	      System.out.println("Number format exception occurred");
       }
       catch(NullPointerException e)
       {
		   System.out.println("NullPointerException..");
	   }
    }
}