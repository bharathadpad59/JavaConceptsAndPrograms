class superclass
{
	String name;
	int id;
	String branch;
	int sal;
	static int x=20;
	public superclass(String a1,int b1,String c1,int d1)
	{
		name=a1;
		id=b1;
		branch=c1;
		sal=d1;
	}

	public void showdetails()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(branch);
		System.out.println(sal);
	}

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

class inheritance11
{
	public static void main(String[] args)
	{
		subclass ref=new subclass();
		ref.superclass("bharat",879,"sbi",87);

     	System.out.println(ref.d);	
     	ref.subclassmethod();
     	System.out.println("-----------------");
     	System.out.println(ref.x);
     	ref.superclassmethod();
	}
}