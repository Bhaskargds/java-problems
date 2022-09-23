package problems;

public class PrimeNumber2 {
    public static void checkPrime(int n){
        int i,m,ndav=0;
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"is not a prime number");
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+"is not a prime number");
                    ndav=1;
                    break;
                }
            }
            if(ndav==0){System.out.println(n+"is a prime number");}
        }
    }
    public static void main(String args[]){
        checkPrime(18);
        checkPrime(6);
        checkPrime(23);

    }

}
