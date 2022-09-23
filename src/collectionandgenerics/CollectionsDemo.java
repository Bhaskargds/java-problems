package collectionandgenerics;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;



public class CollectionsDemo {
    public static void main(String args[])
    {
        Collection<Integer> values= new ArrayList<>();
        values.add(4);
        values.add(7);
        values.add(9);
        values.add(10);
       System.out.println(values);
        Iterator it=values.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
