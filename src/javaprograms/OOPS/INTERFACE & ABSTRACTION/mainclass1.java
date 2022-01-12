interface user
{
	public void login();
	public void logout();
}

class customer implements user
{
	@Override
	public void login()
	{
		System.out.println("login page of user");
	}
	@Override
	public void logout()
	{
		System.out.println("logout page of user");
	}
}

class seller implements user
{
	@Override
	public void login()
	{
		System.out.println("login page of seller");
	}
	@Override
	public void logout()
	{
		System.out.println("logout page of seller");
	}
}
class check
{
	public static user whichuser(char type) 
	{
		user ref;
		if (type=='c')
		{
			ref=new customer();
			return ref;
		}
		else
		{
			ref=new seller();
			return ref;
		}
	}
}

class mainclass1
{
	public static void main(String[] args) { // now we are only typing chars to choose which user we are so we are not writing complete
		user ref1=check.whichuser('s');		// methods ,or object creation here in mainclass,so user who will type not get to know about 
		ref1.login();					   //classes ,objects present he will be able to acces easily called    ABSTRACTION
		ref1.logout();

	}

}