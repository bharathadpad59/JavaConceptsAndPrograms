class method2
{
	/* params:int,int,int
	return: int
	desc: returnm
	*/
	public static int sum(int a,int b,int c)
	{
		if(a%5==0 && b%5==0 &&c% 5==0) 
		{
			return 10;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS............");


		int result=sum(20,10,5);
		System.out.println(result);

		
		System.out.println("PROGRAM ENDS........");
	}
}
