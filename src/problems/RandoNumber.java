package problems;
import java.lang.Math;

import java.util.Scanner;

public class RandoNumber {
    public static void main(String args[]){
        int a=200;
        int b=300;
        int x= (int) (Math.random() * (b - a)+a);
        System.out.println(x);


    }
}
