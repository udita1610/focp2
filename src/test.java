class rectangle
{
	int l,b;
	void display()
	{
		System.out.println((l*b));
	}
	rectangle(int x ,int y)
	{
		this.l=x;
		this.b=y;
	}
}
class box extends rectangle
{
	int h;
	void display()
	{
     int a=l*b*h;
     System.out.println(a);
	}
	box(int x,int y,int z)
	{
		super(x,y);
		this.h=z;
	}
}
class test
{
	public static void main(String arg[])
	{
		box ob=new box(1,1,2);
		ob.display();
	}
}