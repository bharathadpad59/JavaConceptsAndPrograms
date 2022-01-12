class whatsappv1
{

	public static void whatsappv1method(int a,int b) 
	{
		int sum=a+b;
		System.out.println("This is add feature of version 1 so sum="+sum);
	}
}

class whatsappv2 extends whatsappv1
{

	public static void whatsappv2method(int c,int d) 
	{
		int mul=c*d;
		System.out.println("This is multiply feature so c*d="+mul);

		whatsappv1method(c,d);
	}
}

class whatsappv3 extends whatsappv2
{
	public static void whatsappv3method(int e,int f) 
	{
		double div=e/f;
		System.out.println("This is the divide feature so e*f="+div);
	}
}

class inheritance2
{
	public static void main(String[] args)
	{
		whatsappv3 ref=new whatsappv3();

     	
     	ref.whatsappv3method(100,20);
     	System.out.println("-----------------");
     	
     	ref.whatsappv1method(15,25);
     	System.out.println("----------------");
     
     	ref.whatsappv2method(300,40);

	}
}