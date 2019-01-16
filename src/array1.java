//1.	Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions
import java.util.*;
class  Array1
{
	public static void main(String arg[] )
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
	     for(i=0;i<10;i++)
	     {
	     	if(ar[i]==a)
	     	{
	     		System.out.println("index of array"+i);
	     	}
	     }
	}
	
}