class hp 
{
	int bal;
	int sal;
	public hp(int x,int y)
	{
		bal=x;
		sal=y;
		System.out.println("abhi");
	}
}
class dell extends hp
{	
	public void add(int x,int y)
	{
		int deposit=x+y;
		System.out.println(deposit);
	}
}
class mainclass123
{
	public static void main(String[] args) 
	{
		hp h1 =new hp(10,20);
		dell d1 =new dell(h1);
		d1.add();

	}
}
