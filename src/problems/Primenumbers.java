package problems;

import java.util.Scanner;

public class Primenumbers {
    public static void main(String args[]){
        int a , i,flag=0;
        System.out.println("enter the values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a==0||a==1)
        {
            System.out.println(a+"is not a prime number");
        }
        else {

            for (i = 2; i <= 9; i++)  //we know that if any number can divisible within 2-9,so i put tha range form 2-9
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");
                    flag = 1;
                    break;
                }
        }
        if(flag==0){System.out.println("it is a prime number");}

    }
}