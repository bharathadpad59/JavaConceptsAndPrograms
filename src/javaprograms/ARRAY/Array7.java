class Array7
{
	/* arguments - integer array
		data type - int array
		return type - int array
	*/
	public static int[] revers(int[] a1) 
	{
		int c=a1.length-1;
		
		int [] b1=new int[a1.length];

		for (int i=0;i<a1.length ;i++ )
		{
			b1[i]=a1[c];
			c--;
		}
		return b1;
		
	}

	public static void main(String[] args) 
	{
		int [] a={10,20,40,50};
		int [] b=revers(a);

		for (int i=0;i<b.length ;i++ ) 
		{
		System.out.println(b[i]);
		}
	}
}