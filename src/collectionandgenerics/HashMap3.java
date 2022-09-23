package collectionandgenerics;
import java.util.*;
public class HashMap3{
    public static void main(String args[])
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"bhaskar");
        map.put(102,"manjith");
        map.put(106,"deepu");
        System.out.println("after invoking the put method;");
//        for(Map.Entry m:map.entrySet())
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(107,"sunitha");
        System.out.println("after invoking the ifabsent method;");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Map<Integer,String> hm=new HashMap<>();
        hm.put(110,"madhu");
        hm.putAll(map);
        System.out.println("after invoking putalla method:");
        for(Map.Entry m1:hm.entrySet())
        {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
        map.remove(110);
        map.replace(106,"manideep");
        map.replace(107,"sunitha","konda sunitha");
        System.out.println("after invoking replace method:");
        for(Map.Entry m1:map.entrySet())
        {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }




    }
}
