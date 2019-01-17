import java.util.*;

public class program7{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of line: ");
        int n = input.nextInt();
        int row = 1;
        int col = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - col; spc > 0; spc--)   
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                col++;
            } 
            else 
            {
                col--;
            }
            for (int j = 0; j < row; j++) 
            {
                System.out.print(c);
                if (j < row / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                row = row + 2;
            } 
            else
            {
                row = row - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}