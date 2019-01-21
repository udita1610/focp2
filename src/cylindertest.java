import java.util.*;
class Circle
{
	   double radius;
	  String colour;
	 public Circle()
	{
      radius=1.0;
      colour="red";
	}
	public Circle(double r)
	{
      this.radius=r;
 //     this.colour="red";
	}
	public Circle(double r,String c)
	{
		this.radius=r;
		this.colour=c;
	}
	 public void setradius(double r)
	{
		this.radius=r;
	}
	public double getradius()
	{
		return radius;
	}
	public void setcolour(String c)
	{
		this.colour=c;
	}
	public String getcolour()
	{
		return colour;
	}
	public double getarea()
	{
		return 3.14*radius*radius;
	}
}
class Cylinder extends Circle
{
	private double height;
	 public Cylinder()
	{
		height=1.0;
	}
	public Cylinder(double r)
	{
		super(r);
		//this.height=1.0;
		//super(c);
	}
	public Cylinder(double r, double h)
	{
		super(r);
		this.height=h;
		//this.colour="red";
	}
	 public Cylinder(double r, double h ,String c)
	{
		//super(r);
		this.height=h;
		super.colour=c;
	}
	public void setheight(double h)
    {
    	this.height=h;
    }
    public double getheight()
    {
    	return height;
    }
    public double getvolume()
    {
    	return (getarea()*height);
    }
}
class cylindertest
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		double r,h;
		String c;
		System.out.println("enter the radius,height,colour: ");
		r=input.nextDouble();
		h=input.nextDouble();
		c=input.next();
		Cylinder ob=new Cylinder(r,h,c);
		
		System.out.println("height: "+ob.getheight());
		//ob.getradius();
		System.out.println("radius: "+ob.getradius());
	
		System.out.println("area: "+ob.getarea());
		System.out.println("volume: "+ob.getvolume());

	}
}