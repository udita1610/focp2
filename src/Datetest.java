import java.util.*;
class Date
{
	int month,day,year;
	Date()
    {
    	this.day=1;
    	this.month=1;
    	this.year=2000;
    }
    Date(int d, int m ,int y)
    {
     this.day=d;
     this.month=m;
     this.year=y;
    }
	void displayDate()
	{
     System.out.println(day+"/"+month+"/"+year);
	}
}
class Datetest
{
	public static void main(String arg[])
	{
		Scanner input =new Scanner(System.in);
			int d,m,y;
			System.out.print("enter the day");
			d=input.nextInt();
			System.out.println(d);
			
			System.out.print("enter the month");
		    m=input.nextInt();
			System.out.println(m);

            System.out.print("enter the year");
            y=input.nextInt();
            System.out.println(y);
            
        Date ob =new Date(d,m,y);
        ob.displayDate();    

	}
}