class Staticsameclass
{
	static int x=20;               // Accesing static members present in same class
	public static void test()
	{
		System.out.println("This is test method");
		System.out.println("x="+x);
	}


	public static void main(String[] args) 
	{
		System.out.println("x="+x);
		test();
	}

}
