package exceptioncases;

public class ExceptionTest2 {
    public static void main(String args[])
    {
        int a[]={2,4,5,6,7,9};
        try
        {
            System.out.println("value " + a[8]); //it may throw exception
        }
        catch(Exception e)  //it may catch excpetion and handle it
        {
            System.out.println("error");
        }
        System.out.println("excute rest of the code");

    }
}
