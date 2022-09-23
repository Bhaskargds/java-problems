package collectionandgenerics;
import java.util.*;
import java.util.Collections;

import java.util.ArrayList;

public class ClassDemo {
    public static void main(String args[])
    {
        List<Integer>values= new ArrayList<>();
        values.add(234);
        values.add(2);
        values.add(454);
        values.add(12);

         Collections.sort(values);
         ListIterator<Integer>values1=values.listIterator(values.size());
         while(values1.hasPrevious())
         {
             int str=values1.previous();
             System.out.println(str);
         }

//        Collections.shuffle(values);
//        for(Integer i:values)
//        for(int i=0;i<=values.size();i++)
//        {
//            System.out.println(values.get(i));
//        }
    }
}
