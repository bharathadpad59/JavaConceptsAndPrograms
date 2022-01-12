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
	public dell(int x)
	{
		super(10,20);
		System.out.println("Constructor of dell class");
	}	
	public void add()
	{
		deposit=sal+bal;
		System.out.println(deposit);
	}
}
class mainclass1a
{
	
	public static void main(String[] args) 
	{
		dell d1 =new dell(10);
		d1.add();

	}
}