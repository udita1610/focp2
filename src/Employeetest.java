import java.util.*;
class Employee
{
	String fname, lname;
	double salary, newsal, yrsalary;
	Employee()
	{
		this.salary=0;
	}
	Employee(String fn , String ln ,double s)
	{
		this.fname=fn;
		this.lname=ln;
		this.salary=s;
	}
	double yrsal()
	{
      yrsalary=12+salary;
      return yrsalary;
	}
	double raisesal()
	{
       newsal=salary+salary*0.01;
       return newsal;
	}
	void displayinformation()
	{
		System.out.println("first name: "+fname);
		System.out.println("last name: "+lname);
        System.out.println("salary: "+salary);
      System.out.println("yearly salary"+yrsal());
      System.out.println("raise in salary"+raisesal());
      
	}
}
class Employeetest
{
	public static void main(String arg[])
	{
		
		String fn,ln;
		double s;
		for(int i=1;i<=1;i++)
		{
			Scanner input = new Scanner(System.in);
		  System.out.print("enter the first name");
		  fn=inputnextString();
		System.out.println(fn);

		System.out.print("enter the last name");
		ln = inputnextString();
		System.out.println(ln);

		System.out.print("salary");
		s = input.nextDouble();
		System.out.println(s);
		 if(s<0)
		 {
			System.out.print("salary");
		    s=input.nextDouble();
		    System.out.println(s);
		  }
        	
		}
		
        Employee ob1=new Employee();
        ob1.yrsal();
        Employee ob2=new Employee();
        ob2.yrsal();




    }
}