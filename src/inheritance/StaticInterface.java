package inheritance;
interface Demo1
{
    void abc();
    static void show2()
    {System.out.println("hi");}
}

public class StaticInterface
{
    public static void main(String args[]) {
        Demo1.show2();
    }
}
