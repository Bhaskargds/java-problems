package interfacedemo;
interface Drawing
{
    void draw();
}
class Circle implements Drawing{
    public void draw()
    {System.out.println("drawing circle");}

}
class Rectangle implements Drawing{
    public void draw()
    {System.out.println("drawing Rectangle");}
}
class Kitt
{
    public void draw(Drawing k)
    {k.draw();}
}

public class InterfaceTest2 {
    public static void main(String ars[])
    {
        Kitt k= new Kitt();
        Circle c=new Circle();
        Rectangle r=new Rectangle();

        k.draw(c);
    }
}
