package multithreading;
class Hi extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("HI");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
public class MyThread
{
    public static void main(String args[])
    {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.start();
        try {Thread.sleep(10);} catch (Exception e) {}

        obj2.start();

    }
}
