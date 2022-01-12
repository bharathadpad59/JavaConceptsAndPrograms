class user
{
	public static void login() 
	{
		System.out.println("user login");
	}
	public static void logout() 
	{
		System.out.println("user logout");
	}
}

class customer extends user
{
	public static void placeorder() 
	{
		System.out.println("Ur order is placed");
	}
}

class seller extends user
{
  public static void receiveorder() 
	{
		System.out.println("Ur order is received");
	}
}

class inheritance3
{
	public static void main(String[] args) 
	{
		customer ref1=new customer();
		ref1.login();
		ref1.placeorder();
		ref1.logout();

		seller ref2=new seller();
		ref2.login();
		ref2.receiveorder();
		ref2.logout();

	}
}