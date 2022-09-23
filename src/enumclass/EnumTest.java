package enumclass;
import java.lang.Enum;

enum Beer {
    KF,RC,KO,BS;
}

public class EnumTest {
    public static void main(String args[]){
        Beer[] z=Beer.values();
//        System.out.println(z);

        for(Beer b0:z)
        {
            System.out.println(b0);
        }
    }
}
