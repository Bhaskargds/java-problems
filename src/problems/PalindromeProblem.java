package problems;


import java.util.Scanner;

public class PalindromeProblem {
    static int reverse=0;
    public static void main(String args[]){
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt();
        int original=n;
        while(n>0){
            r=n%10;
            reverse=(reverse*10)+r;
            n=n/10;
        }
        if(original==reverse){
            System.out.println(original+"is a palindrome number");
        }
        else{
            System.out.println(original+"is not a palindrome number");

        }


    }
}
