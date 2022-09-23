package arraydemo;
class Calc
{
    public int add(int ...i)

    {
        int sum=0;
        for(int k : i)
        {
            sum= sum+k;
        }
        return sum;

    }
}

public class VaragsDemo
{
    public static  void main(String[] args)
    {
        Calc obj= new Calc();
        System.out.print(obj.add(2,3,8,7,5,6,6,6,5,5,4,4));


    }

}
