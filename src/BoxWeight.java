import java.util.*;
class BoxWeight extends Box
{
	float weight;
	BoxWeight()
	{
		weight=0.0;
	}
	BoxWeight(float w ,float d, float h,float wg )
	{
		super(w,d,h);
		this.weight=wg;
	}
	BoxWeight(BoxWeight bw)
	{
      super(bw.w,bw.d,bw.h);
	  this.weight=wg;
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
		Scanner input = new Scanner(System.in)
		float w,h,d,wg;
		w=input.nextFloat();
		h=input.nextFloat();
		d=input.nextFloat();
		wg=input.nextFloat();
		System.out.println("");
		BoxWeight ob=new BoxWeight(w,h,d,wg);
		System.out.println("volume"+ob.displayVolume);
		System.out.println("volume"+ob.DisplayWeight);

	}
}