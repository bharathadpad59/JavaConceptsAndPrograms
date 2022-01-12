class account
{
	String ename;
	static String bankname;
	long accountno;
	int bal;
	String branch ;

   public  account (String a,long c,int d,String e) 
   {
   	ename=a;
	bankname="ICICI";
	accountno=c;
	bal=d;
	branch=e ;
   	  
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
	account ref1=new account("Bharat",8793462218l,200,"Jaipraksh");
	account ref2=new account("Raja",87456718l,1200,"Jaipraksh");   //Creating new object and passing different persons data is possible
	static account ref4=new account("Ram",9860281103l,6660,"Narendra");    // so anyone can create,update,use the functions forits own value.

}

class Myid
{
	public static void main(String[] args) 
	{
	Constructor ref3=new Constructor();
	ref3.ref1.deposit(500);
	ref3.ref1.Showaccountdetails();
	System.out.println("----------------------------------");
	ref3.ref2.Showaccountdetails();
	System.out.println("----------------------------------");
	ref3.ref4.deposit(500);
	ref3.ref4.Showaccountdetails();
    }
}
