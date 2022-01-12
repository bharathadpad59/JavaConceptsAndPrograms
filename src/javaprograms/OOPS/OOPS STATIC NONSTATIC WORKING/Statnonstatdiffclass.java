class Demo1
{
	int x=20;              // Non Static
	public  void test()				//// Accesing static members  and non static members present in different class
	{
		System.out.println("This is test method");
		System.out.println("x="+x);  // Excessing  Non Static member to Non static member directly as in same class 
	}
	public static void test2()
	{
		System.out.println("This is test2 method");
		System.out.println("x="+ new Demo1().x); // Excessing  Non Static member to static memberin same class by creating object. 
	}
}

class Statnonstatdiffclass

{

public static void main(String[] args) 
{
	System.out.println("x="+ new Demo1().x); // copy all non static
	                                         // member to the object of Demo1 class
	new Demo1().test();
	Demo1.test2();
}
}
