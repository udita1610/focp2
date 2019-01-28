import java.util.*;
class Rectangle
{
	double width, length;
	String color;
	boolean filled;
	/*Rectangle()
	{
		width;
		lenght;
	}*/
	Rectangle(double w,double ln)
	{
      this.width=w;
      this.length=ln;
	}
	Rectangle(double w,double ln, String c, boolean fl)
	{
		this.width=w;
		this.length=ln;
		this.color=c;
		this.filled=fl;
	}
	/*public void setwidth(double w)
	{
		width=w;
	}*/
	public double getwidth()
	{
		return width;
	}
	/*public void setlength(Double ln)
	{
		length=ln;
	}*/
	public double getlength()
	{
		return length;
	}
	public double getarea()
	{ 
	   return length*width; 
	}
	public double getperimeter()
	{
		return 2*(length+width);
	}
}
class Square extends Rectangle
{
	double side;
	/*Square()
	{
		side;
	}*/
	Square(Double s)
	{
		this.side=s;
	}
	Square(double s,double ln,double w,String c,boolean fl)
	{ 
		super(ln,w);
		//super(w)
		this.side=s;
		
		//super(c,fl);
	}
	/*public void setside()
	{
		side=s;
	}*/
	public Double getside(double s)
	{
		return side;
	}
	public void setlength(double s)
	{
		length=side;
	}
	public void setwidth(double s)
	{
		width=s;
	}
}
class Circle
{
	double radius;
	Circle()
	{
		//radius;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	Circle(double r,String c,boolean fn)
	{
      
	}
	public double getrdius()
	{
		return radius;
	}
	public Double getarea()
	{
		return 3.14*radius*radius;
	}
	public double getperimeter()
	{
		return 3.14*2*radius;
	}
}
class Shape
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		double ln , w,r;
		String c;
		System.out.println("enter length:");
		ln=input.nextDouble();
		System.out.println(ln);
		System.out.println("enter width:");
		w=input.nextDouble();
		System.out.println(w);
		System.out.println("enter radius:");
		r=input.nextDouble();
		System.out.println(r);
		Square ob=new Square(ln,w);
		System.out.println("area of square:"+ob.getarea());
		System.out.println("perimeter of square="+ob.getperimeter());
		Circle ob1=new Circle(r);
		System.out.println("area and perimeter of circle :"+ob1.getarea()+ob1.getperimeter());


	}
}