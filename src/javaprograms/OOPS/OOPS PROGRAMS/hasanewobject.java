class post
{
	int likes;
	String comment;       //Aggregasion


	public void likepost() 
	{
		likes++;
	}

	public void comment(String c1) 
	{
		comment = c1;
	}

	public void showlikes() 
	{
		System.out.println("likes="+likes);
	}
	public void showcomments() 
	{
		System.out.println("comment="+comment);
	}
}

class user
{
	String username;
	int  userid;
	String usercollege;
	static post ref1= new post();

	public user(String a,int b,String c)
	{
		username=a;
		userid=b;
		usercollege=c;
	}

	public void showdetails()
	{
		System.out.println(username);
		System.out.println(userid);
		System.out.println(usercollege);
	}
	


}

class hasanewobject
{
	public static void main(String[] args) 
	{
		user refx=new user("Bharat",278,"Raisoni");
		refx.showdetails();



	refx.ref1.likepost();
	
	refx.ref1.comment("hey babby..........");
	refx.ref1.showcomments();
	refx.ref1.likepost();

	refx.ref1.likepost();
	refx.ref1.comment("hey dear..........");

	refx.ref1.likepost();
	refx.ref1.showlikes();
	
	refx.ref1.showcomments();
}

}

