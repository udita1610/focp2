import java.util.*;
class Box
{
 public double  width,height,depth;
  Box()
  {
  	width=0.0;
  	height=0.0;
  	depth=0.0;
  }	
  Box(Double w,Double h,Double d)
  {
  	this.width=w;
  	this.height=h;
  	this.depth=d;
  }
  Box(Box bx)
  {
  	/*this.width=w;
  	this.height=h;
  	this.depth=d;*/
  }
  public/* double*/ void Setwidth( double w)
  {
  	width=w;
  }
  public double getwidth()
  {
  	return width;
  }
   public /*double*/void  Setheight(double h)
  {
  	height=h;
  }
  public double getheight()
  {
  	return height;
  } 
  public /*Double*/ void Setdepth( double d)
  {
  	depth=d;
  }
  public double getdepth()
  {
  	return depth;
  }
 public Double DisplayVolume()
  {
     return width*height*depth;
  }
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight()
	{
		super();
		weight=0.0;
	}
	BoxWeight(Double w ,Double d, Double h,Double wg )
	{
		super(w,d,h);
		this.weight=wg;
	}
	BoxWeight(BoxWeight bw)
	{
      /*super(bw.w(),bw.d(),bw.h());
	  this.weight=wg;*/
	}
	public double DisplayWeight()
	{
      return weight; 
	}

}
class Boxdemo 
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		Double w,h,d,wg;
		System.out.println("enter the width: ");
		w=input.nextDouble();
		System.out.println("enter the height: ");
		h=input.nextDouble();
		System.out.println("enter the depth: ");
		d=input.nextDouble();
		System.out.println("enter the weight: ");
		wg=input.nextDouble();
		System.out.println("");
		BoxWeight ob=new BoxWeight(w,h,d,wg);
		System.out.println("volume"+ob.DisplayVolume());
		System.out.println("weight"+ob.DisplayWeight());

	}
}