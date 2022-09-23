package multithreading;
class Test3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class ThreadingPractice1 {
    public static void main(String args[]) throws Exception
    {
        Thread  t1= new Test3();
        Thread t2= new Test3();
        Thread t3= new Test3();
        t1.start();
        t1.join(1500);
//        try{t1.join();}catch(Exception e){}
        t2.start();
        t3.start();
    }
}
