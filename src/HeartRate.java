import java.util.*;
class Date
{
	 private int day , month, year;
	
     /*Date(int d , int m, int y)
	{
       
		this.day=d;
		this.month=m;
		this.year=y;
	}*/
       public void set(int d,int m ,int y)
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
	Date date;
    int agecal, maxhr,thr;
	HeartRate(String fn,String ln ,int d , int m, int y)
	{
        firstname=fn;
        lastname=ln;
        date=new date();
        date.set(d,m,y)
	}

	/*public void set()
	{
		Scanner in=new Scanner(System.in);
		this.firstname=in.nextLine();
		this.lastname=in.nextLine();

	}*/
	/*public String getfirstname()
	{
		return firstname;
	}
	public String getlastname()
	{
		return lastname;
	}*/
    voi agecal()
    {
    	/*LocalDate today = LocalDate.now();//Today's date
       Dat0e birthday = Date.of(d,m,y);//Birth date
 
       Period p = Period.between(birthday, today);*/
 
      /*System.out.println(period.getDays());
       System.out.println(period.getMonths());
       System.out.println(period.getYears());*/
       agecal=2019-date.getYears();
       if(1-date.getMonths()<0)
       	agecal--;
       else if(18-date.getday()<0)
       	--agecal;
       return agecal;

    }
    double rate()
    {
    	//int rate=220-agecal();
         // System.out.println("Heart	Rate per minute: "+(220-agecal()));
        maxhr=220-agecal();
        return maxhr;
    }
    double targetrate()
    {
    	thr=maxhr/2;
    	return thr;
    }
    public int getday()
    {
    	return date.getday();
    }
    public int getmonth()
    {
    	return date.getmonth();
    }
    public int getyear()
    {
    	return date.getyear();
    }
    void display()
    {
    	System.out.println("name :"+firstname+""+lastname);
    	System.out.println("DOB"+getday()+"/"+getmonth()+"/"+getyear());
    	System.out.println("age : "+agecal());
    	System.out.println("HeartRate: "+rate());
    	System.out.println("target HeartRate:"+targetrate());
    }
    
}



