package multithreading;
class Abcd implements Runnable
{
    public void run()
    {
        System.out.println("now the new threading is running");
    }
}

public class ThreadingPractise {
    public static void main(String args[])
    {
        Runnable r1= new Abcd();
        Thread t1=new Thread(r1,"Bhaskar");

        t1.start();
//        String str=t1.getName();
        System.out.println(t1.getName());
    }
}
