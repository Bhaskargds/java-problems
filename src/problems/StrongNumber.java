package problems;

import java.util.Scanner;
class Krishnamurthy{
    int r,y=1,z=0;

    public void function(int x){
        int original=x;
        while(x>0){
            r=x%10;
            for(int i=r;i>=1;i--){
                y=y*i;
            }
            z=z+y;
            y=1;
            x=x/10;
        }
        if(z==original){
            System.out.println(original+" is a strong number");
        }
        else{
            System.out.println(original+" is not a strong number");
        }

    }

}

public class StrongNumber {
    public static void main(String args[]){
//        int r,y=1,z=0;
        Krishnamurthy kis=new Krishnamurthy();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values:");
        int x= sc.nextInt();
        kis.function(x);

//        int original=x;
//        while(x>0){
//            r=x%10;
//            for(int i=r;i>=1;i--){
//                y=y*i;
//            }
//            z=z+y;
//            y=1;
//            x=x/10;
//        }
//        if(z==original){
//            System.out.println(original+" is a strong number");
//        }
//        else{
//            System.out.println(original+" is not a strong number");
//        }


    }
}
