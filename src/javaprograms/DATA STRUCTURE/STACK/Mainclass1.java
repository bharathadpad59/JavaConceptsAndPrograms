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
class Mainclass1
{
	public static void main(String[] args) 
	{
		checking c1 = new checking(); // object of c1 is created in that value is incrementing because we r calling 
		c1.check();			// same method again & again in SAME OBJECT C1 so value incremented in c1.
		c1.check();			// hence result be 7.
		int c=c1.test();
		System.out.println(c);

	}
	
}