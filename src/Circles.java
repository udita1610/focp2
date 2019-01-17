import java.util.*;
public class circles
   {
      public static double pi = 3.14;
     static int r;
   
       public static double area()
      {
       double a = pi *r*r;
       return a;
       }
     public static double circumference()
 {
    double c = 2*pi*r;
    return c;
 }
 public static void display()
 {
    System.out.println("area of circle:"+area());
    System.out.println("circumference o circle:"+circumference());
 }
 public static void main(String arg[])
 {
    Scanner input = new Scanner(System.in);
     System.out.print("radius:");
     r=input.nextInt();
   
    System.out.println(r);
    display();
 }
} 