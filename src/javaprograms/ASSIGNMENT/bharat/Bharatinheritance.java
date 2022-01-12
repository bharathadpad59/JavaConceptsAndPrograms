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
	int deposit;
	public dell()
	{
		System.out.println("Constructor of dell class");
	}	
	public void add()
	{
		deposit=sal+bal;
		System.out.println(deposit);
	}
}
class Bharatinheritance
{
	
	public static void main(String[] args) 
	{	hp h1=new h1(20,40);
		dell d1 =new dell();
		d1.add();

	}
}