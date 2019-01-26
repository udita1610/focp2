import java.util.*;
interface GeometricObjects
{
	public double getPerimeter();
	public double getArea();
}
interface Resizable()
{
	public double resize(int percent);
}
class Circle implements GeometricObjects
{
	double radius;
	Circle()
	{
		radius=1.0;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	public double  getPerimeter()
	{
		return 2*3.14*radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
class ResizableCircle extends Circle implements Resizable
{
  // double radius;
   ResizableCircle(double radius)
   {
   	//this.radius=r;
   	super(r);
   }	
  public Double resize(int percent)
   {
   	radius+=percent/100;
   	System.out.println("resized perimeter: "+getPerimeter());
   	System.out.println("resized area: "+getArea()); 
   }
  
}
class AreaTest
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		double r;
		int percent;
		System.out.print("enter the value of radius:");
		r = in.nextDouble();
		System.out.println(r);
		System.out.print("enter hte percentage by which radius is increased:");
		percent=in.nextInt();
		System.out.print(percent);
		ResizableCircle ob=new ResizableCircle(r);
		ob.resize(percent);
		


	}
}
