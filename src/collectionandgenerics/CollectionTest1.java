package collectionandgenerics;
import java.util.*;
public class CollectionTest1{
    public static void main(String args[])
    {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("bhaskar");
        queue.add("sunitha");
        queue.add("laxmi");
        queue.add("mourya");
        System.out.println("Head element: "  + queue.peek());
        System.out.println("Head element: "+  queue.element());
        System.out.println("iterating the queue elements");
        Iterator it=queue.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("iterating the remaining elements after removing:-");
        Iterator it1=queue.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }

    }
}