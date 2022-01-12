class checking
{
	 private  int a=5;

	public void check()
	{
		a=a+1;

	}

	public void test()
	{
		System.out.println(a);
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		checking c1 = new checking();
		c1.test();
	}
	
}