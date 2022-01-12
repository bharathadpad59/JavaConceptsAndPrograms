class numberpattern1
{
	public static void main(String[] args)
	 {
		
		for(int i=1;i<=3;i++)
		{
			int n=1;
		for(int j=1;j<=3;j++)
		{
			if(j>=i && j<=6-i)
			{
			 	System.out.print(" " + (n++));
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(" ");
		}
	}
}