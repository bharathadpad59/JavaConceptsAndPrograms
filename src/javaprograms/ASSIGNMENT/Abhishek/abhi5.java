class abhi5
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7;i++) 
		{
			int k=7;
			for (int j=1;j<=7;j++) 
			{
				if (j>=i) 
				{
					k=k-1;
					System.out.print(k);	
				}
			}
			System.out.println();
		}
	}
}