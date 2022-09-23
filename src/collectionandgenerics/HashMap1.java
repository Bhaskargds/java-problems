package collectionandgenerics;
import java.util.*;


public class HashMap1 {
    public static void main(String args[])
    {
        Map<String,String> map = new HashMap<>();
//        Map map=new Map();
        map.put("name1","baskar");
        map.put("name2","manjith");
        map.put("name3","deepu");
//        System.out.println(map);
//        Set set=map.entrySet();
//        Set set=map.entrySet();
        //Iterator it= set.iterator();
//        while(it.hasNext())                    //using while loop
//        {
//
//            Map.Entry entry=(Map.Entry)it.next();
//
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }


        Set<String> set=map.keySet();           //using for looop
        for(String key:set)

        {
            System.out.println(key+"= "+map.get(key));
        }



    }
}
