package problems;

import java.util.Scanner;

public class palindromeExample2 {
     public static void main(String args[]){
         String orignal,reverse="";
         Scanner sc =new Scanner(System.in);
         System.out.println("enter character to be check:");
         orignal=sc.nextLine();
         int length=orignal.length();
         for(int i=length-1;i>=0;i--)
         {
             reverse=reverse+orignal.charAt(i);
         }
         System.out.println(reverse);
         if(orignal.equals(reverse))
         {

             System.out.println("it is a palindrome number");
         }

         else {
             System.out.println("it is not palindrome number");
         }

     }
}
