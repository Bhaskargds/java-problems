package problems;

import java.util.Scanner;
class PalindromeExample{
    public static void main(String args[]){
        int r,sum=0,temp;
        Scanner sc=new Scanner((System.in));
        System.out.println("enter the value to be check:");
        int n=sc.nextInt();

//        int n=454;//It is the number variable to be checked for palindrome20

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp+"palindrome number ");
        else
            System.out.println(temp+ " not palindrome");
    }
}
