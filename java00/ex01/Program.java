package java00.ex01;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);

            int i = 2;
            int n = scanner.nextInt();
            if (n <= 1)
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            while( i <= Math.sqrt(n))
            {
                if (n % i == 0)
                {
                    System.out.println("false " + (i - 1));
                    scanner.close();
                    System.exit(0);
                }
                i++;
            }
            System.out.println("true " + (i - 1));
            scanner.close();
        }
        catch (Exception e)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
    }
}