package exceptioncases;

public class ExceptionDemo
{ public static void main(String args[])
    {

    try
    {
        int i=10;
        int j=0;
        int k=i/j;
        System.out.println("out put is :" + k);
    }
    catch (ArithmeticException e)
    {
        System.err.println("error");

    }
    finally {
        System.out.println("bye");
    }

   // System.out.println(m);

}}
