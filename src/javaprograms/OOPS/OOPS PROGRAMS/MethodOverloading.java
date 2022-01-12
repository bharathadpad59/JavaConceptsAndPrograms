class Superclass
{
	int v1=20;
	public  void test() 
	{
		System.out.println("This is test() of superclass at no arguments");
	}

	public  void test(int x) 
	{
			System.out.println("This is test() of superclass at int x");
	}

	public  void test(int x,int y) 
	{
		System.out.println("This is test() of superclass at int x,int y");
	}

	public  void test(double x,int y) 
	{
			System.out.println("This is test() of superclass at double x,int y");
	}
}

class MethodOverloading
{
	public static void main(String[] args) 
	{
		Superclass ref1=new Superclass();

		ref1.test();
		ref1.test(10,20);
		ref1.test(10);
		ref1.test(10.75,20);
	}
}