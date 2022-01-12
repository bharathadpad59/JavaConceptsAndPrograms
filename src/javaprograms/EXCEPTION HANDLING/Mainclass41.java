import java.util.Scanner;

class Mainclass41
{
	public static void login() throws LoginPassException
	{
		Scanner sc1=new Scanner(System.in);

		int num=3;

		for (int i=1;i<=3 ;i++ ) 
		{
			System.out.println("Enter Pin");
			int pin=sc1.nextInt();

			if (pin==1234) 
			{
				// Loginpass ref1=new Loginpass();
				// throw ref1;
			}
			else
			{
				System.out.println((3-i)+"Attempts left");
				num--;
			}
		}

		if (num==0) 
		{
			LoginPassException ref=new LoginPassException();
			throw ref;
		}

		
	}

	public static void main(String[] args) 
	{
		try
		{
			login();
		}
		/*
		catch(LoginFailedException e)
		{
			e.printStackTrace();
		}
		catch(Loginpass p)
		{
			p.printStackTrace();
		}
		*/
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}