package problems;
import java.lang.Math;


public class RandomEx1 {
    public static void main(String args[]){
        int x=200;
        int y=400;
        int z=(int)(Math.random()*(y-x+1)+x);

        System.out.println(z);


    }
}
