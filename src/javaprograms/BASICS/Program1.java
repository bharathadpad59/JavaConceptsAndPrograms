class Program1
{
	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=4;i++)
		{
			int k=1;
		for(int j=1;j<=7;j++)
		{
			if(j>=i && j<=8-i)
			{
			 	System.out.print(" * ");
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