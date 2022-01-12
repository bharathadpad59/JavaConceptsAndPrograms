class methodmultiply
{
	public static boolean multiply(int a,int b) 
	{
		if (a*b>=10)
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
		boolean b=multiply(10,20);
		System.out.println(b);
	}
}