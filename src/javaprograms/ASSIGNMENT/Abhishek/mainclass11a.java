class hp 
{
	int x;
	int y;
	public static void h()
	{
		
		System.out.println("abhi");
	}
}
class dell extends hp
{
	int deposit;
	public void add()
	{
		hp h1=new hp();
		h1.h(10,20);
		deposit=x+y;
		System.out.println(deposit);
	}
}
class mainclass11a
{
	
	public static void main(String[] args) 
	{
		dell d1 =new dell();
		d1.add();

	}
}