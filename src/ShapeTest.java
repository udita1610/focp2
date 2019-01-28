import java.util.*;
class Rectangle
{
	double length , breath;
	Rectangle(double l,double b)
	{
		this.length=l;
		this.breath=b;
    }
    public double getlength()
    {
    	return length;
    }
    public Double getbreath()
    {
    	return breath;
    }
    public double displayArea()
    { 
    	return length*breath;
    }
}
class Triangle
{
	double height,base;
	Triangle(double h,double bs)
	{
		this.height=h;
		this.base=bs;
		//this.side3=s3;
	}
	public double getheight()
	{
		return height;
	}
		public double getbase()
	{
		return base;
	}
	/*	public double getside3()
	{
		return side3;
	}*/
	public double displayArea()
	{
		return base*height/2;
	}
}
class ShapeTest
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		double l,b,h,bs;
		System.out.print("enter length: ");
		l=in.nextDouble();
		System.out.println(l);
		System.out.println("enter breath :");
		b=in.nextDouble();
		System.out.println(b);
		System.out.println("enter height:  ");
		h=in.nextDouble();
		System.out.println(h);
		System.out.println("enter base: ");
		bs=in.nextDouble();
		System.out.println(bs);
		Rectangle ob = new Rectangle(l,b);
		System.out.println("area of rectangle:"+ob.displayArea());
		Triangle ob1=new Triangle(h,bs);
		System.out.println("area of triangle:"+ob1.displayArea());
	}

}


