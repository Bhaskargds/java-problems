package interfacedemo;
abstract class Writer
{
    abstract public void write();
}
class Pen extends Writer
{
    public void write()
    {System.out.println("writing with pen");}
}
class Pencil extends Writer
{
    public void write()
    {System.out.println("writing with pencil");}
}
class Kit
{
    void doSomething( Writer k)  //object of pencil is assigning to k
    {
        k.write();
    }
}
public class InterfaceDemo
{
    public static void main(String args[])
    {
        Kit k=new Kit();
        Writer p=new Pen();     //polymorphism
        Writer pc=new Pencil();
      //  pc.write();

        k.doSomething(p);
    }
}

