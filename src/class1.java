class Date
{
	
	Date()
    {
    	this.date=1/1/2000;
    }
    Date1(int d1)
    {
     this.day=day;
     this.month=month;
     this.year=year;
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
		Scanner in =new Scanner(System.in);
			int month,day,year;
			day=in.nextInt();
			System.out.println("enter the day"+day);
			
			month=in.nextInt();
			System.out.println("enter the month"+month);

            year=in.nextInt();
            System.out.println("enter the year"+year);
        Datetest ob =new datetest();
        ob.displayDate();    

	}
}