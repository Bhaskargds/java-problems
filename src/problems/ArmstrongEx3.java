package problems;

import java.util.Scanner;

public class ArmstrongEx3 {
    static int digits=0,temp,r,sum=0;

    static boolean isArmstrong(int n){
//        int digits=0,temp,r,sum=0;
        temp=n;
        while(n>0){
            n=n/10;
            digits++;
        }
        n=temp;
        while(n>0){
            r=n%10;
            sum= (int) ( sum+(Math.pow(r,digits)));
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+" is a armstrong number");
        }else{
            System.out.println(num+" is not a armstrong number");
        }


    }
}
