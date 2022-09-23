package interfacedemo;
interface Demo
{
    void abc();
    default void show1()
    {System.out.println("in demo");}
}
interface MyDemo
{
    default void show1()
    {
        System.out.println("in my deomo");
    }
}
class DemoImp implements Demo,MyDemo
{
    public void abc()
    {
        System.out.println("in demo imp");
    }
    public void show1()
    {
        MyDemo.super.show1();
    }

}
public class SuperInterface
{
    public static void main(String args[])
    {
        DemoImp obj= new DemoImp();
        obj.abc();
        obj.show1();
    }
}

