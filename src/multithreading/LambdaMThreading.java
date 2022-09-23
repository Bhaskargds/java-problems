package multithreading;

public class LambdaMThreading {
    public static void main(String args[]) throws Exception
    {
        Thread t1= new Thread(() ->
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("manjith "  + Thread.currentThread().getPriority()); //here printing hi along with tread priority
                try {Thread.sleep(1000);}  catch(Exception e){}
            }
        },"manjith thread");
        Thread t2=new Thread(() ->
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("bhaskar");
                try {Thread.sleep(1000);} catch(Exception e){}
            }
         },"bhaskar thread");
//       t1.setName("bhaskar thread"); //giving name to the thread
//        t2.setName("manjith thread ");
        t1.setPriority(Thread.MIN_PRIORITY); //given priority number to the thread
        t2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(t1.getPriority());//printing the tread priority number at console
//        System.out.println(t2.getPriority());
//        System.out.println(t1.getName()); //printing the thread name at console

        t1.start();
        try {Thread.sleep(100);} catch(Exception e){}
        t2.start();


        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        }}

