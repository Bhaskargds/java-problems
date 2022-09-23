package defaultkeyword;
interface Abc
{
    void abc();  //variable declaration in interface
    default void show()
    {System.out.println("be focused");}
}
class demo implements Abc
{
    public void abc()
    {
        System.out.println("in show");
    }
    public void show()
    {
        System.out.println("in new show");
    }
}

public class DefaultInterface {
    public static void main(String args[])
    {
        Abc obj= new demo();
        obj.show();
        obj.abc();
    }
}
