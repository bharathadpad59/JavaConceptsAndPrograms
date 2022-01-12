import java.util.Scanner;
class account
{
	String ename;
	String bankname;
	long accountno;
	int bal;
	String branch ;

   public  account (String a,String b,long c,int d,String e) 
   {
   	ename=a;
	bankname=b;
	accountno=c;
	bal=d;
	branch=e ;
   	  
   }    

    public  account (String l,long m,int n,String o) 
   {
   	ename=l;
	accountno=m;
	bal=n;
	branch=o ;
   	  
   }    
     public  account (String x,long y,int z) 
   {
   	ename=x;
	accountno=y;
	bal=z;
   	  
   }                       
              //Creating new object and passing different persons data irrespective of size is possible
					               // so anyone can create,update,use the functions forits own value.
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

class Overloadingconstructor1
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);

	account ref1=new account("Bharat","BOI",8793462218l,200,"Jaipraksh");
	ref1.deposit(12305);
	ref1.withdrawal(2505);
	ref1.check();
	System.out.println("------------------------");
	ref1.Showaccountdetails();

	System.out.println("------------------------------------");

	System.out.println("Enter the details of person name");
	System.out.println("Enter the details of person bank name");
	System.out.println("Enter the details of person mobil no");
	System.out.println("Enter the details of enter balance");
	System.out.println("Enter the details of person branchname");
	account ref2=new account(scn.nextLine(),scn.nextLine(),scn.nextLong(),scn.nextInt(),scn.nextLine());   // hereautomatically BOI will come in another account because
	System.out.println("Enter thedeposit amt");
	ref2.deposit(scn.nextInt());
	System.out.println("Enter the withdrawal amt");											   //static keyword in front of bankname so, once it is initialized
	ref2.withdrawal(scn.nextInt());										   // it will be copyed to every new account as ststic means single copy
	ref2.check();
	System.out.println("------------------------");
	ref2.Showaccountdetails();
	

	
	
	
	

}
}