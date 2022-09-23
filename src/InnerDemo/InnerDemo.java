package InnerDemo;
class Outer
{
    public void show() {
        System.out.println("in outer show");
    }
    public static class Inner
    {
        public void display()
        {
            System.out.println("in inner class display");
        }
    }
}

public class InnerDemo
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1= new Outer.Inner();
        obj1.display();


    }

}
