
import java.util.*;
class Pascal
{
    public static void main(String[] args)
    {       
        int rows;
        boolean ch=false;
        Scanner input = new Scanner(System.in);
        do
        {
        System.out.println("Enter the number of rows you want to print :");
        rows = input.nextInt();
        for(int i = 0; i < rows; i++)
        {
            int number = 1;
            System.out.format("%" + (rows-i) * 2 + "s" , "");
               for(int j = 0; j <= i; j++)
                {
                   System.out.format("%4d",number);
                   number = number * (i - j) / (j + 1);
                }
            System.out.println();
        }
        System.out.println("ifwant to ry again");
        ch=true;
    }while(ch);
    }
}