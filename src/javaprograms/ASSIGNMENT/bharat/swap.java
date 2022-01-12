class swap
{
	public static void main(String[] args) 
	{
		int a=20,b=30;

		b=a+b;
		a=b-a;
		b=b-a;

		System.out.println("A and B is "+a+" "+b);
	}
}