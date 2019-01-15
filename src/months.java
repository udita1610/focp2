import java.util.*;
class months
{
	public static void main(String arg[])
	{
      Scanner input = new Scanner(System.in);
      int num;
      System.out.print("enter the number from 1 to 12:");
      num=input.nextInt();
      System.out.println(num);
      switch(num)
      {
      	case 1:
      	System.out.println("the 1 month is january");
      	break;
      	case 2 :
      	System.out.println("the 2 month is february");
      	break; 
      	case 3:
      	System.out.println("the 3 month is february");
      	break;
      	case 4:
      	System.out.println("the  4 month is february");
      	break;
        case 5:
      	System.out.println("the 5 month is february");
      	break;
      	case 6:
      	System.out.println("the 6 month is february");
      	break;
      	case 7:
      	System.out.println("the 7 month is february");
      	break;
      	case 8:
      	System.out.println("the 8 month is february");
      	break;
      	case 9:
      	System.out.println("the 9 month is february");
      	break;
        case 10:
      	System.out.println("the 10 month is february");
      	break;
        case 11:
      	System.out.println("the 11 month is february");
      	break;
        case 12:
      	System.out.println("the 12 month is february");
      	break;
      	default:
      	System.out.println("invalid input");
      }
   }
}