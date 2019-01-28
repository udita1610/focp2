import java.util.*;

class Assignment1
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String fn, ln, em, cn, l1, l2, c, s;
		int p, d, m, y, x, v, b, n, i;	
		System.out.println("Enter the number of students");
		n=input.nextInt();
		Student[] student = new Student[n];
		for (i=0;i<n;i++)
		{
			System.out.println("Enter firstname");
			fn=input.next();
			System.out.println("Enter lastname");
			ln=input.next();
			System.out.println("Enter email");
			em=input.next();
			System.out.println("Enter cnumber");
			cn=input.next();
			System.out.println("Enter l1");
			l1=input.next();
			System.out.println("Enter l2");
			l2=input.next();
			System.out.println("Enter city");
			c=input.next();
			System.out.println("Enter state");
			s=input.next();
			System.out.println("Enterpc");
			p=input.nextInt();
			System.out.println("Enter date");
			d=input.nextInt();
			m=input.nextInt();
			y=input.nextInt();
			System.out.println("Enter number of skills");
			x=input.nextInt();
			System.out.println("Enter number of Qualifications");
			v=input.nextInt();
			System.out.println("Enter number of Projects");
			b=input.nextInt();
			student[i]=new Student(fn,ln,em,cn,l1,l2,c,s,p,d,m,y,x,v,b);
			student[i].DisplayStudent(x,v,b);
		}
	}
}