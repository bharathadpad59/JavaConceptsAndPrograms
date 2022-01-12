class pattern
{
	public static void main(String[] args)
	{
		for(int i=0;i<=2;i++)
		{
			for (int j=0;j<=4 ;j++ )
			{
				if(j>=2-i && j<=2+i)
				{
					System.out.print(" * ");
				}
			
			}
			System.out.println("  ");
		}
	}
}