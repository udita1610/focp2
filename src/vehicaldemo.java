import java.util.*;
class vehicle
{
	void display()
	{
		System.out.println("this is vehicle");
	}
}
class bike extends vehicle
{
	void display()
	{
		System.out.println("this is bike");
	}
}
class car extends vehicle
{
	void display()
	{
		System.out.println("this is car");
	}
}
class vehicledemo
{
  public static void main(String arg[])
  {
  	Scanner input=new Scanner(System.in);
    int x;
    System.out.print(" the value of x 2 or 4: ");
    x=input.nextInt();
    System.out.println(x);
    switch(x)
    {
    	case 2 :
    	{
    		Bike ob=new Bike();
    		ob.display();
    	}
    	break;
    	case 4:
    	{
    		Car ob1=new Car();
    		ob1.display();
    	}
    	break;
    	default
    	{
    		vehicle ob2=new vehicle()
    		ob2.display();
    	}

    }

  	
  }
}