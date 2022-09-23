package enumclass;

import java.util.Scanner;

enum Beer1{
    KF,RC,KO,BS;
//    String a;
}

public class EnumTest1 {

    public static void main(String args[])
    {
//        String a;
//        Scanner sc=new Scanner(System.in);
//        a=sc.next();

        Beer1 b2=Beer1.KF;
        switch(b2)
        {
            case KF:
                System.out.println("this beer is for children");
                break;
            case RC:
                System.out.println("this RC is some what strong");
                break;
            case KO:
                System.out.println("this KO is light");
                break;
            case BS:
                System.out.println("this BS can give high kick");
                break;
            default:
                System.out.println("not recomended brands");
        }

    }

}
