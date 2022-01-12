class superclass
{
	static int x=20;

	public static void superclassmethod() 
	{
		System.out.println("This is superclassmethod");
	}
}

class subclass extends superclass
{
	int d=70;

	public static void subclassmethod() 
	{
		System.out.println("This is subclassmethod");
	}
}

class inheritance1
{
	public static void main(String[] args)
	{
		subclass ref=new subclass();

     	System.out.println(ref.d);	
     	ref.subclassmethod();
     	System.out.println("-----------------");
     	System.out.println(ref.x);
     	ref.superclassmethod();
	}
}