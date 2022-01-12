class Superclass
{
	int v1=20;
	public  void test() 
	{
		System.out.println("This is test() of superclass");
	}
}

class Subclass extends Superclass
{
	int w1=20;
	@Override
	public  void test() 
	{
			System.out.println("This is test() of subclass");
	}
}

class MethodOverriding
{
	public static void main(String[] args) 
	{
		Subclass ref1=new Subclass();
		Superclass ref2=new Superclass();

		System.out.println(ref1.w1);
		System.out.println(ref1.v1);

		ref1.test();
		ref2.test();
	}
}