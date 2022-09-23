package problems;

import java.util.*;

public class PolindromeString {
    public static void main(String args[]){
        String reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string name:");
        String original=sc.nextLine();
        int length=original.length();
//        System.out.println(l-1);
        for(int i=length-1;i>=0;i--)
        {
          reverse = reverse+original.charAt(i);

        }
        if(original.equals(reverse)){
            System.out.println(original +"is polindrome string ");
        }
        else{
            System.out.println(original +"is not a polindrome  string");
        }

    }
}


