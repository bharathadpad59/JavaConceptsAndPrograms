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

class Ram 
{
	Scanner scn=new Scanner(System.in);

	account ref1=new account(scn.nextLine(),scn.nextLine(),scn.nextLong(),scn.nextInt(),scn.nextLine());
	
}

class Laxman
{
	Scanner scn=new Scanner(System.in);

	account ref2=new account(scn.nextLine(),scn.nextLine(),scn.nextLong(),scn.nextInt(),scn.nextLine());
}


class Accountchecking
{
	
	public static void checkingid(Object obj) 
	{
		if (obj instanceof Ram) 
		{

	Scanner scn=new Scanner(System.in);
			
			Ram r1=(Ram)obj;

			System.out.println("Enter deposit amt");
			r1.ref1.deposit(scn.nextInt());
			System.out.println("Enter withdrawl amt");
			r1.ref1.withdrawal(scn.nextInt());
			r1.ref1.Showaccountdetails();

			System.out.println("-------------------");
		}
		else if (obj instanceof Laxman) 
		{

	Scanner scn=new Scanner(System.in);
			Laxman l1=new Laxman();
			l1=(Laxman)obj;
			System.out.println("Enter deposit amt");
			l1.ref2.deposit(scn.nextInt());
			System.out.println("Enter withdrawl amt");
			l1.ref2.withdrawal(scn.nextInt());
			l1.ref2.Showaccountdetails();
			
			System.out.println("------------------------");
		}

		else
		{
			System.out.println("INVALID DETAILS...........");
		}
	}
}

class AccountExtraction
{
	

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the details to create accoount and do the operations");

	System.out.println("Enter the details of person name");
	System.out.println("Enter the details of person bank name");
	System.out.println("Enter the details of person mobil no");
	System.out.println("Enter the details of enter balance");
	System.out.println("Enter the details of person branchname");
		
		Ram ramgmail=new Ram();
		Laxman laxmangmail=new Laxman();
		System.out.println("Enter ur registration email");
	
		String str=scn.nextLine();
		String str1="ramgmail";
		String str2="laxmangmail";
		{
			if (str==str1) 
			{
				Accountchecking.checkingid(ramgmail);
			}

			else if(str==str2)
			{
				Accountchecking.checkingid(laxmangmail);
			}
			else
			{
				System.out.println("INVALID...............");
			}
		}
		


	


	}
	
}
