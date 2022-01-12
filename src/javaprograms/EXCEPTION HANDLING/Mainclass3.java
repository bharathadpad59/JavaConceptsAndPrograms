class Mainclass3
{
	public static void test(int num) throws InterruptedException
	{
		System.out.println("Entering test()");

		Thread.sleep(100);

		System.out.println("Exit test()");		//// CHECKED EXCEPTIONS  I.E  INTERRUPTED EXCEPTIONS
	}

	public static void main(String[] args) 
	{
		try
		{
			test(0);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();	
		}
	}

}