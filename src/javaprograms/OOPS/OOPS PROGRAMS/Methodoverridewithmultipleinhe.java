class whatasappv1
{
	public static void version() 
	{
	System.out.println("Whatsapp v1 features");
	}	
}

class whatasappv2 extends whatasappv1
{
	public static void version() 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}	
	System.out.println("Whatsapp v2 features");
	}	
}

class whatasappv3 extends whatasappv2
{
	public static void version() 
	{
	System.out.println("Whatsapp v3 features");
	}	
}

class Methodoverridewithmultipleinhe
{
	public static void main(String[] args) 
	{
		whatasappv3 ref3=new whatasappv3();
		ref3.version();	
		whatasappv2 ref2=new whatasappv2();
		ref2.version();	
		whatasappv1 ref1=new whatasappv1();
		ref1.version();	
	}

}
	