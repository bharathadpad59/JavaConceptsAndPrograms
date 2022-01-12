class sample
{
	static int v=23;
	public static void test()
	{
		System.out.println("this is test()");
		System.out.println("v= "+ v);
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		System.out.println("v= "+sample.v);
		sample.test();
		System.out.println("program ends..");
	}
}