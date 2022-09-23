package exceptioncases;

public class ExceptionTest1
{
    public static void main(String args[])
    {

    int i=80;
    int j=0;
    int data;
    try
    {
        data=i/j;
        System.out.println(data);
    }
    catch(Exception e)
    {
//        int data1=i/j;
       System.out.println("result " + i/(j+2));
    }
    System.out.println("excution is completed");
}}
