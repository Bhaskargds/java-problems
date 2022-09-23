package functionalinterface;
interface Abc  //functional interface
{
    void show();
}

public class FunctionalInterface {
    public static void main(String args[])
    {
        Abc obj=() -> System.out.println("Sit like rock and work line a time"); //defining lambda Expression

        obj.show();
    }
}
