class checking
{
	 private  int a=5;

	public void check()
	{
		a=a+1;

	}

	public int test()
	{
		return a;
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		checking c1 = new checking();
		c1.check();
		c1.check();
		int c=c1.test();
		System.out.println(c);

	}
	
}