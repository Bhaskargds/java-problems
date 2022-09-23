package exceptioncases;

public class MultipleExceptions {
    public static void main(String args[])
    {
        try
        {
            int a[]=null;

          //  a[3]=10;
            int i=8;
            int j=0;
            int k=i/j;
            System.out.println("out put value is:"+ a[3]);
            System.out.println("out put value is:"+ k);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error");
        }
        catch(Exception e)  //it handle the anytype of exceptions thatsy we put it at last,here it is for null exception,it like superhero
        {
            System.out.println("something went wrong");
        }
        finally
        {
            System.out.println("bye");
        }

    }
}
