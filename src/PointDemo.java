class Point
{
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	Point()
	{
		System.out.println("");
	}
	Point(int x1,int x2)
	{
		this.x1=x1;
		this.x2=x2;
	}
	Point(int x1,int x2,int y1,int y2)
	{
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public double getx1()
	{
		return x1;
	}
	public double getx2()
	{
		return x2;
	}
	public double gety1()
	{
		return y1;
	}
	public double gety2()
	{
		return y2;
	}
	public void setx1(int x1)
	{
		this.x1=x1;
	}
	public void setx2(int x2)
	{
		this.x2=x2;
	}
	public void sety1(int y1)
	{
		this.y1=y1;
	}
	public void sety2(int y2)
	{
		this.y2=y2;
	}
	double distance(Point P1)
	{
		double dis;
		dis=Math.sqrt(Math.pow((getx2()-P1.getx1()),2) + Math.pow((gety2()-P1.gety1()),2));
		return (dis);
	}
}
class PointDemo
{
	public static void main(String args[])
	{
		Point P2=new Point();
		Point P3=new Point();
		double d1;
		P2.setx1(5);
		P2.sety1(7);
		P3.setx2(9);
		P3.sety2(10);
		d1=P3.distance(P2);
		System.out.println(d1);
	}
}