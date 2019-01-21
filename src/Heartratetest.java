import java.util.*;
class Heartratetest
{
	public static void main(String[] args) 
	{
		int i;
		int[] d= new int[2];
		int[] m= new int[2];
        int[] y= new int[4];
        String fn,ln;
        HeartRate[] ob = new HeartRate[2];
        Scanner in = new Scanner(System.in);
        for(i=0;i<2;i++)
        {
        	System.out.println(" enter the date of birth: ");
        	fn=in.nextLine();
        	ln=in.nextLine();
        	System.out.println("enter the name and date of birth: "); 
        	d[i]=in.nextInt();
        	System.out.println("date:  ");
        	m[i]=in.nextInt();
        	System.out.println("month: ");
        	y[i]=in.nextInt();
        	System.out.println("year: ");
        	ob[i]= new HeartRate(fn,ln,d[i],m[i],y[i]);
        	ob[i].display();      
        	      
        }
	}	
	
}