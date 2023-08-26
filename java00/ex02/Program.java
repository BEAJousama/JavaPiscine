package java00.ex02;

import java.util.Scanner;

public class Program {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int i = 2;
        while (i <= Math.sqrt(n))
        {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static int sumDigits(int n) {
        int result = 0;
        while (n != 0)
        {
            int remainder = n % 10;
            result += remainder;
            n = n/10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int result = 0;
        while (scanner.hasNextInt() && (number = scanner.nextInt()) != 42)
        {
            if (isPrime(sumDigits(number)))
                result++;
        }
        System.out.println("Count of coffee-request: " + result + "\n" + "Have a nice day!");
        scanner.close();
    }
}
