package collectionandgenerics;
import java.util.*;

public class ArrayList4 {
    public static void main(String args[])
    {
        String [] str={"bhaskar","mourya","deepu"};
        System.out.println(Arrays.toString(str));
        List<String> list=new ArrayList<>();



        for(String s: str)
            list.add(s);
        {
            System.out.println(list);
        }

    }
}
