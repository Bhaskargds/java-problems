package interfacedemo;
interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {

    public void b() {
        System.out.println("i am b");
    }
}

class M extends B
{
    public void a(){System.out.println("i am a");}
    public void c(){System.out.println("i am c");}
    public void d(){System.out.println("i am d");}

}
//enum
//class Test extends M
//{
  //  void doSomething(A k)
    //    switch(k)
    //{
      //  case A:

    //}
//}
public class InterfaceTest {
    public static void main(String args[])
    {
        A obj;
        obj=new M();
        obj.b();
        obj.a();
        obj.c();
    }
}
