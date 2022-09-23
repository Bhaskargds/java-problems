package problems;

import java.util.Scanner;

public class PrimeNumber6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("print the prime values in between 1 to 50");
        int n=sc.nextInt();
        for(int i=2;i<n+1;i++){
            for(int j=2;j<=n-1;j++){
                if(i%j==0 && i!=2){
                    break;

                }else{
                    System.out.println(i);
                    break;
                }

            }
        }
    }
}
