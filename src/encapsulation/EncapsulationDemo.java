package encapsulation;

import javax.naming.Name;

class Student
{
    private int rollno;
    private String name;
    public void setRollno(int r)
    {
        rollno=r;
        System.out.println("value of rollno changed");
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}
public class EncapsulationDemo
{
    public static void main(String args[])
    {
        String x = "2";
        int y = Integer.parseInt(x); //type casting
        System.out.println(y);
        Student s1= new Student();
        s1.setRollno(7);
        s1.setName("bhaskar");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}