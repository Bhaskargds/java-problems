package collectionandgenerics;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo
{
    public static void main(String args[])
    {
        List<Integer>values=new ArrayList<>();
        values.add(10);
        values.add(12);
        values.add(3);
        values.add(9);

        Collections.sort(values,(i,j)-> i%10 >j%10 ? 1:-1);
        for(Integer i:values)
        {
            System.out.println(i);
        }
    }
}
