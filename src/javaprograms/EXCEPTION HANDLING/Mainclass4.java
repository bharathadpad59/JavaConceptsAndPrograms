import java.util.Scanner;
class LoginFailedException extends Exception
{

}


class Mainclass4
{
	public static void login() throws LoginFailedException 
	{
		Scanner sc1=new Scanner(System.in);

		int num=3;

		for (int i=1;i<=3 ;i++ ) /// CHECKED EXCEPTIONS  I.E  CUSTOM MADE EXCEPTIONS thats why usings throws keywordto propogate
								 // checked exceptionsfrom called method(login()) to calling method (Main()) explicitly by the programer
		{								
			System.out.println("Enter Pin");
			int pin=sc1.nextInt();

			if (pin==1234) 
			{
				System.out.println("Login succes");
				break;
			}
			else
			{
				System.out.println((3-i)+"Attempts left");
				num--;
			}
		}

		if (num==0) 
		{
			LoginFailedException ref=new LoginFailedException();
			throw ref;    // custom exceptions can be thrown by the programmer explicitly by using throw keyword.
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			login();
		}
		catch(Exception e)//LoginFailedException
		{
			e.printStackTrace();
		}
	}
}