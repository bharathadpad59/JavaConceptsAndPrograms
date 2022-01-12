class post
{
	int likes;
	String comment;


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
	static post ref1= new post(); 
}

class hasarelation
{
	public static void main(String[] args) 
	{
	
	user refx=new user();

	refx.ref1.likepost();
	refx.ref1.showlikes();

	user.ref1.likepost();
	
	user.ref1.comment("hey babby..........");
	user.ref1.showcomments();
	user.ref1.likepost();

	user.ref1.likepost();
	user.ref1.comment("hey dear..........");

	user.ref1.likepost();
	user.ref1.showlikes();
	
	user.ref1.showcomments();
}

}

