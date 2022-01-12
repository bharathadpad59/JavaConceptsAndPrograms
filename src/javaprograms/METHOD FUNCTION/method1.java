class method1
{
	/* params:int,int
	return: boolean
	desc: returnm
	*/
	public static boolean sum(int a,int b)
	{
		if (a+b>50) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS............");


		boolean result=sum(20,20);
		
		System.out.println(result);


		System.out.println("PROGRAM ENDS........\\");
	}
}
