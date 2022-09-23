package problems;

import java.util.Scanner;
import java.util.Scanner;

public class Primenumber4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value;");
        int n=s.nextInt();


        if (isPrime(n)) {
            System.out.println(n + "is the prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }
    }
        public static  boolean isPrime(int n)
        {
            if(n<1){
                return false;
            }
            else{
                for(int i=2;i<Math.sqrt(n);i++)  // it will work in test cases
//                for(int i=2;i<n*n;i++)   //it is not work because n*n giver number in which checking number exist so code give wrong out put
                {
                    if(n%i==0)
                    {
                        return false;

                    }
                } return true;
            }
        }

}
