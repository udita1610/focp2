import java.util.*;
class program4
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		int num ,y;
		System.out.print("enter the 5 digit number:");
		num= input.nextInt();
		System.out.println(num);
		int digit1=num/10000;
		int digit2=((num%10000)/1000);
		int digit3=((num%1000)/100);
		int digit4=((num%100)/10);
		int digit5=num%10;
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
	
	}
}