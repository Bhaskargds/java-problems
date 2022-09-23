package collectionandgenerics;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Stud implements Comparable<Stud>
{
    int rollno,marks;
    String name;
    public Stud(int rollno,String name,int marks)
    {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    public String toString()
    {
        return "student details[roll no="+rollno+",name="+name+",marks="+marks+"]";
    }
    public int compareTo(Stud s)
    {
        return name.length()>s.name.length()?1:-1;
    }


}
public class ComparableInterface{
    public static void main(String args[]){
        List<Stud> studs=new ArrayList<>();
        studs.add(new Stud(14,"bhaskar",89));
        studs.add(new Stud(24,"Deepu",92));
        studs.add(new Stud (24,"mourya",96));
        studs.add(new Stud(25,"dhayana",99));
        System.out.println(studs.isEmpty());
        Collections.sort(studs);
        for(Stud s:studs )
        {
            System.out.println(s);
        }


    }
}