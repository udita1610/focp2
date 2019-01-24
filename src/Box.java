import java.util.*;
class Box
{
  float width,height,depth;
  Box()
  {
  	width=0.0;
  	height=0.0;
  	depth=0.0;
  }	
  Box(float w,float h,float d)
  {
  	this.width=w;
  	this.height=h;
  	this.depth=d;
  }
  Box(Box bx)
  {
  	this.width=w;
  	this.height=h;
  	this.depth=d;
  }
  public  setwidth()
  {
  	width=w;
  }
  public double getwidth()
  {
  	return width;
  }
   public  setheight()
  {
  	height=h;
  }
  public double getheight()
  {
  	return height;
  } 
  public  setdepth()
  {
  	depth=d;
  }
  public double getdepth()
  {
  	return depth;
  }
 public double displayVolume()
  {
     return w*h*d;
  }
}