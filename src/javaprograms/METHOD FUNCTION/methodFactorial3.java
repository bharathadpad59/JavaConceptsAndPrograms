class methodFactorial3
{
	/* 
	parameters=int;
	return type=int;
	return factorial value;
	*/
	public static int fact(int a) 
	{
		int b=1;
		for (int i=a;i>=1 ;i-- ) 
		{
			b=b*i;	
		}
		return b;

		
	}
	public static void main(String[] args)
	{
		int result=fact(5);

		System.out.println(result);
	}
}