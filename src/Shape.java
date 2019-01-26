import java.util.*;
class Rectangle
{
	double width, length;
	String color;
	boolean filled;
	Rectangle()
	{
		width;
		lenght;
	}
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
	public void setwidth(double width)
	{
		width=w;
	}
	public double getwidth()
	{
		return width;
	}
	public void setlength()
	{
		length=ln;
	}
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
	

}