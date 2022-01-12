class database
{
	String name;
	String country;
	String instaid;
	int nofollowers;
	int nofollowing;
	int noposts;

	public database(String name,String country,String instaid,int nofollowers,int nofollowing,int noposts)
	{
		this.name=name;
		this.country=country;
		this.instaid=instaid;
		this.nofollowers=nofollowers;
		this.nofollowing=nofollowing;
		this.noposts=noposts;
	}
	public void showdetails()
	{
		System.out.println("name="+name);
		System.out.println("Country="+country);
		System.out.println("instaid="+instaid);
		System.out.println("no.follow="+nofollowers);
		System.out.println("no following="+nofollowing);
		System.out.println("no.posts="+noposts);
	}
}

class myfollowersinfo
{
	database ref1=new database("Bharat","India","bharathadpad",567,457,22);
	database ref2=new database("Abhishek","Switerzland","ram",420,234,29);
	database ref3=new database("Pranav","Norway","prrrrrnav",420,234,29);
}

class hasacomposition     ///This is My account and i am linking my followers with my account.
{
	public static void main(String[] args) 
	{
	myfollowersinfo refres=new myfollowersinfo();

	refres.ref1.showdetails();
	System.out.println("----------------------------------");
	refres.ref2.showdetails();
	System.out.println("---------------------");
	refres.ref3.showdetails();
	}

}