package collectionandgenerics;
import java.util.*;
class Student
{
        int rollno,age;
        String name;
public Student(int rollno,String name,int age)
        {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        }
//public String toString()
//        {
//        return "student[rollno= "+rollno+",name="+name+",age="+age+"]";
//        }

        }
public class ArrayList1 {
    public static void main(String args[])
    {
//        Student s1= new Student(12,"bhaskar",26);
//        Student s2= new Student(14,"deepu",1);
//        Student s3= new Student(12,"sunitha",29);
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(12,"bhaskar",25));
        al.add(new Student(10,"mourya",6));
        al.add(new Student(4,"sunitha",29));
//        al.add(s1);
//        al.add(s2);
//        al.add(s3);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Student str=(Student)itr.next();
            System.out.println(str.rollno+" "+str.name+" "+str.age);

        }
//        for(Student st:al)  //for each loop not applicatble for iterator
//        {
//            System.out.println(st);
//        }


    }
}
