package collectionandgenerics;
import java.util.*;
class Book
{
    int pageno,quantity;
    String author,name;
    public Book(int pageno,String author,String name,int quantity)
    {
        this.pageno=pageno;
        this.author=author;
        this.name=name;
        this.quantity=quantity;
    }
}

public class HashMap4 {
    public static void main(String args[])
    {

    Book B1=new Book(100,"bhaskar","its my jrny",1);
    Book B2=new Book(120,"bhaskar","gn2javadev",2);
    Map<Integer,Book> map=new HashMap<Integer,Book>();
    map.put(1,B1);
    map.put(2,B2);
    for(Map.Entry<Integer,Book> entry:map.entrySet())
    {
        int key=entry.getKey();
        Book s=entry.getValue();
        System.out.println(key+"Details:");
        System.out.println(s.pageno+" "+s.author+" "+s.quantity+" "+s.name);
    }

    }

}
