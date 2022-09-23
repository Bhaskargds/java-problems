package problems;

import java.util.Scanner;

class ConvertingNoWord{
    public boolean isPalindrome(int x){
        if(x<0||(x%10==0 && x!=0)){
            return false;
        }
        int original=x;
        int returnNo=0,r;
        while(x>0){
            r=x%10;
            returnNo=(returnNo*10)+r;
            x=x/10;

        }
        return returnNo==original;

    }
    public static void main(String[] args)
    {
        ConvertingNoWord obj=new ConvertingNoWord();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the values:");
        int n=sc.nextInt();
//        obj.isPalindrome(n);
        if(obj.isPalindrome(n))
        {
            System.out.println("numer is palindrome ");
        }
        else {
            System.out.println("number is not palindrome");

        }
//        public boolean isPalindrome(int x){
//            if(x<0||(x%10==0 && x!=0)){
//                return false;
//            }
//            int returnNo=0;
//            while(x>returnNo){
//                returnNo=(returnNo*10)+x%10;
//                x=x/10;
//
//            }
//            return x==returnNo;
//
//        }
    }

}