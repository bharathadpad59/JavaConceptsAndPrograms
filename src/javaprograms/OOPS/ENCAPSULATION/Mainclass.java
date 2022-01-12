import java.util.Scanner; 
class Account
{
	
	private double bal=300.0;
	private long accountno=87934622185l;

	public double getbal()
	{
		return bal;
	}

	public void setbal(double balance)
	{
		this.bal=balance;
		System.out.println(bal);
	}

}

class Transaction
{
	public void deposit(int amt, Account a1)
	{
		if (amt>0) 
		{
			double b1=a1.getbal();
				b1=b1+amt;
			a1.setbal(b1);
		}
		else
		{
			System.out.println("INAVLID AMOUNT.............");
		}
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		Account acc=new Account();
		Transaction tx=new Transaction();

		System.out.println("ENter the deposit amt");

		tx.deposit(scn.nextInt(),acc);
	}
}