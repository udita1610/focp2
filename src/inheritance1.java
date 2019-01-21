import java.util.*.;
class Circle
{
	private double radius;
	private String colour;
	Circle()
	{
      this.radius=1.0;
      this.colour="red";
	}
	Circle(double r)
	{
      this.radius=r;
      this.colour="red";
	}
	Circle(double r,String c)
	{
		this.radius=r;
		this.colour=c;
	}
	 public void setradius(double r)
	{
		radius=r;
	}
	public double getradius()
	{
		return radius;
	}
	public void setcolour(String c)
	{
		colour=c;
	}
	public String getcolour()
	{
		return colour;
	}
	public double getarea()
	{
		return area= 3.14*radius*radius;
	}
}
class cylinder extends Circle
{
	private double height;
	cylinder()
	{
		this.height=1.0;
	}
	cylinder(double r)
	{
		this.radius=r;
		this.height=1.0;
		this.colour="red";
	}
	cylinder(double r, double h)
	{
		this.radius=r;
		this.height=h;
		this.colour="red";
	}
	cylinder(double r, double h ,String c)
	{
		this.radius=r;
		this.height=h;
		this.colour=c;
	}
	public void setheight(double h)
    {
    	height=h;
    }
    public double getheight()
    {
    	return height;
    }
    public doubl getvolume()
    {
    	return volume=3.14*getradius()*getradius()*getheight();
    }
}
class cylindertest
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in)
		double r,h;
		String c;
		System.out.println("enter the radius,height,colour: ");
		r=input.nextDuble();
		h=input.nextDuble();
		c=input.nextLine();
		Cylinder ob=new Cylinder()
		ob.height();
		System.out.println("height: ");
		ob.radius();
		System.out.println("radius: ");
		ob.area();
		System.out.println("area: ");
		ob.volume();
		System.out.println("volume: ");

	}
}