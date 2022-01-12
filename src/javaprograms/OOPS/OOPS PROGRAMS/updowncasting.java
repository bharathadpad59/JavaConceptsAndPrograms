class superclass
{
	int x1=20;
	public static void method1() 
	{
		System.out.println("This is the method of superclass()");
	}
}

class subclass extends superclass
{
	int y1=200;
	public static void method2() 
	{
		System.out.println("This is the method of subclass()");
	}
}

class updowncasting
{
	public static void main(String[] args) 
	{
		subclass ref1=new subclass();
		superclass ref2=ref1;           //upcasting
		subclass ref3=(subclass) ref2;  //downcasting

		ref2.method1();
		System.out.println(ref2.x1);
													   // superclass ref = new subclass();  //upcasting
		System.out.println("-----------------");      //ref.method1(); ok          upcasted ref var of superclass can only store & access 
													  //ref.method2(); not ok      superclass values like methods,var values.
		ref3.method1();
		System.out.println(ref3.x1);
		System.out.println("-----------------------------");
		ref3.method2();
		System.out.println(ref3.y1);
	}

}