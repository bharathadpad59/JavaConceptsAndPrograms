class numberpattern7
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=9;
		for (int i=1;i<=5 ;i++ ) 
		{			
			for (int j=0;j<=6 ;j++ ) 
			{
				if(i<=3)
				{
				if (j==i || j==6-i) 
					{
					System.out.print(n);
					}
				else {
					System.out.print(" ");
					}
				}
			else{
				if (j==6-i || j==i) {
					System.out.print(k);
					}
				else {
					System.out.print(" ");
					}
				}
			}
			n++;
			k--;
			System.out.println(" ");
		}
	}
}