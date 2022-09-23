package enumclass;
import java.util.*;
enum days
{
    SUNDAY,MONDAYM,TUESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumTest2{
    public static void main(String args[])
    {
//        Set<days> set=EnumSet.allOf(days.class);

        Set<days> set=EnumSet.noneOf(days.class);
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
//        days[] d=days.values();
////        System.out.println(d);
//        for(days d1:d)
//        {
//            System.out.println(d1);
//        }
    }
}