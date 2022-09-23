package inheritance;
class Calculator
{
    public  int add(int ...i)   //hero for each loop concept is used
    {
        int sum=0;
        for(int k : i)
        {
            sum=sum+k;
        }
        return sum;
    }
}
class AdcCal extends Calculator
{
    public  int sub(int i,int j)
    {
        return i-j;
    }
}
class VeryAdcCal extends AdcCal
{
    public  int mul(int i,int j)
    {
        return i*j;
    }
}

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        VeryAdcCal c1= new VeryAdcCal();
        int result1=c1.add(5,8,4,9,3);
        int result2=c1.sub(9,4);
        int result3=c1.mul(9,4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
