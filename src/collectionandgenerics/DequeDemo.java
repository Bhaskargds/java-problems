package collectionandgenerics;
import java.util.*;


public class DequeDemo {
    public static void main(String args[]){
    Deque<String> deque=new ArrayDeque<String>();
        deque.add("bhaskar");
        deque.add("bhaskar");
        deque.add("sunitha");
        deque.add("chandana");
        deque.add("sameera");
        for(String s:deque)
        {
            System.out.println(s);
        }


    }
}
