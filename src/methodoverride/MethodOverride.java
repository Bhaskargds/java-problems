package methodoverride;
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    public void show()
    {

     //   super.show();  //super key word is used to access the super class and show is for method
        System.out.println("in B");
    }
    public void configure()
    {
        System.out.println("in configure");
    }
}
class C
{
    public void show()
    {
        System.out.println("in c");
    }
}

public class MethodOverride {
    public static void main(String args[])
    {
        A obj= new B();
        obj.show();
        //obj.configure();
        obj= new A();
        obj.show();

    }
}
