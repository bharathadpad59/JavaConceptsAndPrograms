class account
{
	String ename;
	static String bankname="ICICI"; // if u want to use common bank names then we declare it globally
	long accountno;
	int bal;
	String branch ;

   public  account (String a,/*String b*/,long c,int d,String e) 
   {
   	ename=a;
   	//String bankname=b;         //by writing ur bank name in constructor u can change the bank name
	accountno=c;
	bal=d;
	branch=e ;

	return;	  
   }
									      ////  wecant use another users values to check but
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

	public void Bankname() 
	{
		System.out.println(bankname);
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

class Constructor
{
public static void main(String[] args) 
{
	account ref1=new account("Bharat",8793462218l,200,"Jaipraksh");

	ref1.deposit(12305);
	ref1.withdrawal(2505);
	ref1.check();
	ref1.Bankname();
	System.out.println("------------------------");
	ref1.Showaccountdetails();

	System.out.println("------------------------------------");

	account ref2=new account("Raja",87456718l,1200,"Jaipraksh"); //Creating new object and passing different persons data is possible
																   // so anyone can create,update,use the functions for its own value.
	ref2.deposit(1500);
	ref2.withdrawal(200);
	ref2.check();
	System.out.println("------------------------");
	ref2.Showaccountdetails();
	
}
}