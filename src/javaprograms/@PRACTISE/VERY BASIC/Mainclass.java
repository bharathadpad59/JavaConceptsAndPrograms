class Mainclass
{
	public static int[] reverse(int[] a1) 
	{
		int[] c= new int[a1.length];

		int j=0;
		for (int i=a1.length-1;i>=0 ;i--) 
		{
			 c[j] = a1[i];
			 j++;
		}
		return c;
	}

	public static void main(String[] args) 
	{
		int[] b={10,20,30,40};
		int[] d=reverse(b);

		for (int j=0;j<=d.length-1;j++ ) 
		{
			System.out.print(d[j]+" ");
		
		}
	}
}