class Statnonstatsameclass
{
	static int  x=20;
	int k1=20;
	public  void test1()           //// Accesing static members  and non static members present in same class
	{
		System.out.println("This is test1 method");
		System.out.println("x="+x);   ///Accesing static member in non static member directly in same class
		System.out.println("k1="+k1); ///Accesing NON-static member in NON-static member directly in same class
	}
	public static void test2()
	{
		System.out.println("This is test 2 method");
		System.out.println("x="+x);
	}
	public static void main(String[] args) 

	{
			System.out.println("x="+x);
			//System.out.println("k1="+k1);   not possible
			test2();
			new Statnonstatsameclass().test1();  // copying all non static member (method values) to new object of Demo2 class type.
								 				 // new ClassName().Methodname()
	}
}