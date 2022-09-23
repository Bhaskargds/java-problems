package collectionandgenerics;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String args[])
    {
        List values=new ArrayList(); //list is a interface which extends the collection
        values.add(4);  //these elements are not element ,these are Integer object(Integer i=new Integer(4)) in backend work like this
        values.add(6);
        values.add(1);
        values.add(2,"bbhaskar");
        values.add(2,10); // adding the element 10 at index 2.this is not possible in collection
//        for(Object o:values)
//        {
//                System.out.println(o);
//         }
        for(int i=0;i<values.size();i++)
        {
            System.out.println(values.get(i));
        }

    }
}
