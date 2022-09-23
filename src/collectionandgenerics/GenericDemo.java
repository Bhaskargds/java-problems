package collectionandgenerics;

import java.util.List;
import java.util.ArrayList;

public class GenericDemo {
    public static void main(String args[])
    {
        List<Integer>values=new ArrayList<>();
        values.add(4);
        values.add(5);
//        values.add(2,"bhaskr");// string type not supported here because list interger type generic is mentioned
        for(Integer i:values)
        {
            System.out.println(i);
        }
    }
}
