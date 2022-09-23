package interfacedemo;
interface printable
{
    void print();
}
class A1 implements printable {

    public void print()
    {
        System.out.println("sit like rock and work like a time");
    }
}

public class InterfaceTest1 {
    public static void main(String args[])
    {
        A1 obj=new A1();
        obj.print();

    }
}
