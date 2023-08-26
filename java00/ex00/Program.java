// Description: Sum of digits of a number
public class Program   
{  
    public static void main(String[] args)   
    {  
        int number = 479598; 
        int result = 0;
        while(number != 0)   
        {  
            int remainder = number % 10;
            result += remainder;
            number = number/10;  
        }  
        System.out.println(result);
    }  
} 