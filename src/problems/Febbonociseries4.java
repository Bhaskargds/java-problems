package problems;

import java.util.Scanner;

public class Febbonociseries4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUES :");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b);
        while(true){
            c=a+b;
            if(c>n){
                break;
            }
            System.out.print(" "+c);
            a=b;
            b=c;


        }


    }
}
