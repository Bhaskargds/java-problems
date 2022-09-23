package problems;

import java.util.Scanner;

public class armstrongExample {
    public static void main(String args[]){
        int r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to check:");
        int n=sc.nextInt();
        int original=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(original==sum) {
            System.out.println(original + "is a armstron number");
        }
        else{
            System.out.println(original +"is not armstrong number");

        }


    }

}
