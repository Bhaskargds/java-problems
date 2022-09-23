package problems;

public class ForPractuse {
    public static void main(String args[])
    {
       char c;
       for(int i=1;i<=4;i++){
           c='a';
           for(int j=1;j<=i;j++){
               System.out.print(" "+c);
               c++;
           }System.out.println();
       }
    }
}
