class Array8
{
	public static boolean check(int [] a1) 
	{
		int l=a1.length;
		int firstterm=0;
		int lastterm=a1.length-1;

		if(a1[firstterm]==a1[lastterm])
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
		int [] a={10,20,30,40,50,20};
		boolean array=check(a);
		System.out.println(array);

	}

}