package arraydemo;

public class ElfArray
{
    public static void main(String[] args)
    {
        int  d[][]={  {1,3,4,5,7},
                    {1,3,4,7},
                    {1,3,7}
        };
        for( int k[] : d)
        {
            for( int l : k)
            {
                System.out.print(" " + l);
            }System.out.println();

        }
    }
}
