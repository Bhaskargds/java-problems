package collectionandgenerics;
import java.util.*;

public class ArrayLIst2 {
    public static void main(String args[])
    {
        ArrayList<String> al= new ArrayList<>();
        al.add("bhaskar");
        al.add("deepu");
        System.out.println("after invoking the add method:" +al);
        al.add("mourya");
        System.out.println("after invoking the add method:" +al);
        ArrayList<String> al2= new ArrayList<>();
        al2.add("manjith");
        al2.add("sunitha");
        al.addAll(al2);
        System.out.println("after invoking the add method:" +al);
        ArrayList<String> al3=new ArrayList<>();
        al3.add("laxmi");
        al3.add("ulthepa");
        al.addAll(2,al3);
        System.out.println("after invoking the add method:" +al);
        System.out.println("is arraylist empty=" +al.isEmpty());



    }
}
