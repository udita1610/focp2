import java.util.*; 
class Fnarray2
{
	public static void index(int a,int ar[])
	{
		int i;
		  for(i=0;i<10;i++)
	     {
	     	if(ar[i]==a)
	     	{
	     		System.out.println("index of array"+i);
	     	}
	     }
	}
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
	int[] ar=new int[10];
	System.out.print("enter array");
	int i;
	for(i=0;i<10;i++)
	 {
	 	//System.out.print("element of array");
	 	ar[i]=input.nextInt();
	  }
	    System.out.println("enter element");
	    int a = input.nextInt();
	    index(a,ar);
	}
}