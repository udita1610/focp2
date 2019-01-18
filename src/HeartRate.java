import java.util.*;
class Date
{
	int day;
	int month;
	int year;
     date(int d , int m, int y)
	{
       
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public int getday()
	{
		return day;
	}
	public int getmonth()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}



}

class HeartRate
{
	String firstname, lastname;
	Date date()
	HeartRate(String fn,String ln ,int d , int m, int y)
	{
        this.firstname=fn;
        this.lastname=ln;
        date=new date(d,m,y);
	}
	
	//public void set()
	//{
	//	Scanner in=new Scanner(System.in);
	//	this.firstname=in.nextLine();
	//	this.lastname=in.nextLine();

	//}
	public String getfirstname()
	{
		return firstname;
	}
	public String getlastname()
	{
		return lastname;
	}


}