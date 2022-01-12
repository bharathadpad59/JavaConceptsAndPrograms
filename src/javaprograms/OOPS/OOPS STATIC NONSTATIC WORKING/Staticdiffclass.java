class Demo1
{												 //// Accesing static members  present in Different class
	 static  int x=20;
	public static void test()    
	{
		System.out.println("This is test method");
		System.out.println("x="+x);  ///Accesing static member in non static member directly in same class
	}
}



class Staticdiffclass
{

public static void main(String[] args) 
{
	System.out.println("x="+Demo1.x);		/// ClassName.MemberName
	Demo1.test();
}
}


/*
class Demo1
{
	int x=20;
	public static void test()     
						//// Accesing static members  present in Different class and Non Static members in same class
	{
		Demo1 d11=new Demo1();
		System.out.println("This is test method");
		System.out.println("x="+d11.x);        

		// u have to create object to access non static members in same class
	}
}



class Staticdiffclass
{

	public static void main(String[] args) 
	{
	//System.out.println("x="+Demo1.x);// u dont have to create object to access static methods whether it contains
	                                    // non static  
	Demo1.test();				// u have to create object in called method only.
	
	}
}

*/