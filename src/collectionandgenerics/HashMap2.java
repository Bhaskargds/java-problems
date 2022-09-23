package collectionandgenerics;
import java.util.*;

public class HashMap2
{
    public static void main(String args[])
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(2,"bhaskar");
        map.put(4,"deepu");
//        System.out.println(map.entrySet());
        System.out.println(map);
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
