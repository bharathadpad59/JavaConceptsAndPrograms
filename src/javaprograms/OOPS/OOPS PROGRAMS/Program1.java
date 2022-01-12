class account
{
	String ename="Bharat";
	static String bankname="SBI"; //once u will reinitialize static data means it will affect every instance i.e objects
	long accountno=8793462218l;
	int bal=2750;
	String branch ="Jaiprakash Nagar";

	/*
	String ename1="Bharathadpad";
	static String bankname1="SBI";
	long accountno1=9960281103l; 
	int bal1=500;
	String branch1 ="Karve Nagar";
	*/
									      ////  we cant use another users values to check but
										 ///we can create object different times and can do calculation
	public void deposit(int x) 
	{
		bal=bal+x;
		System.out.println(bal);
	}

	public void withdrawal(int y) 
	{
		bal=bal-y;
		System.out.println(bal);
	}

	public  void check() 
	{
		System.out.println(bal);
	}


	public void Showaccountdetails() 
	{
		System.out.println(ename);
		System.out.println (bankname);
		System.out.println(accountno);
		System.out.println(bal);
		System.out.println(branch);
	}
}

class Program1
{
public static void main(String[] args) 
{
	account ref1=new account();
	account ref3=ref1;

	
	System.out.println("-----------------------");
	ref1.deposit(5000);
	ref1.withdrawal(1000);
	ref1.check();
	ref1.bankname="BOI";
	System.out.println("------------------------");
	ref3.withdrawal(2000);
	ref1.Showaccountdetails();

	System.out.println("---------------------------------------------");

	account ref2=new account();
	ref2.deposit(2000);
	ref2.check();
	ref2.Showaccountdetails();


	ref1.check();
	ref3.check();
}
}