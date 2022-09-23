package abstractclass;
abstract class Shape{
    abstract void draw();}
class Rectangle extends Shape{
    void draw()
    { System.out.println("draw rectangle shape");}
}
class Circle extends Shape{
    void draw()
    {System.out.println("draw circle shape");}
}

class TestAbstraction {
    public static void main(String args[])
    {
//        int k=Integer.parseInt(i);
  //      System.out.println(k);
        Shape s1=new Rectangle();
        s1.draw();
        s1=new Circle();
        s1.draw();



}}
