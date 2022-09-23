package encapsulation;
class Account
{
    private long acc_no;
    private String name;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }


    public void setAcc_no(long acc_no)
    {
        this.acc_no=acc_no;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public float getAmount()
    {
        return amount;
    }
    public void setAmount(float amount)

    {
        this.amount=amount;
    }

}

public class TestEncapsulation {
    public static void main(String args[])
    {
        Account a1=new Account();
        a1.setName("bhaskar");
        a1.setAmount(500000);
        a1.setAcc_no(201710622);
        System.out.println(a1.getAcc_no()+"=account number " +  a1.getAmount()+"=balance " + a1.getName()+"=ame");
    }
}
