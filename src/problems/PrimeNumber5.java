package problems;

import java.util.Scanner;

public class PrimeNumber5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first the number;");
        int start=s.nextInt();
        System.out.println("enter the second value:");
        int end=s.nextInt();
        System.out.println("listing the prime numbers between"+ start+ "and"+ end);
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}