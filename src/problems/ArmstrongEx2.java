package problems;
import java.lang.Math;

import java.util.*;

public class ArmstrongEx2 {
    public static void main(String args[]){
        int r,digits=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to find armstrong numbe:");
        int n=sc.nextInt();
        int original=n;
        while(n>0){
            n=n/10;
            digits++;
        }
        n=original;
        while(n>0){
            r=n%10;
            sum= (int) (sum+(Math.pow(r,digits)));
            n=n/10;
        }
        if(original==sum) {
            System.out.println(original + " number is armstrong number");
        }
        else{
            System.out.println(original+" numberr is not aarmstrong number");

        }
    }
}