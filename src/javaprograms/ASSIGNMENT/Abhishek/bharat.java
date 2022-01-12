interface Hp
{
	int bal;
	int sal;
	public Hp(int x,int y)
	{
		int bal=x;
		int sal=y;
	}
}
class Dell extends Hp
{
	int deposit;
	public void addition()
	{
		deposit=bal+sal;
		System.out.println(deposit);
	}
}
class bharat
{
	
	public static void main(String[] args) 
	{	
		Hp h1=new Hp(10,20);
		Dell d1 =new Dell();
		d1.addition();

	}
}