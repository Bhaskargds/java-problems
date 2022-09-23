package anonymousclass;
interface A
{
    void show();
   // {System.out.println("i am drinkin");}
}
public class AnonymousClass {
    public static void main(String args[] )
    {

        A obj=new A()
                        {
                        public void show()
                        {System.out.println("you are going to become a java devoloper soon...be focused");}
                          };
        obj.show();
}}
