package exceptioncases;

public class UserDefinedException {
    public static void main(String args[])
    {
        int i=8;
        int k=9;
        int data;
        try
        {
            data=i/k;
            if(data==0)
                throw new TelusoException("I dont know");

            System.out.println(data);
        }
        catch(TelusoException e)
        {
            System.out.println("some thing error " + e.getMessage());
        }
    }
}
