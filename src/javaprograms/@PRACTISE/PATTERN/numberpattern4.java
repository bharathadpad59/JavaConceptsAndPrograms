	class patternalpahabet1
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=4 ;i++ ) 
		{
			char n='A';
			
			for (int j=1;j<=7 ;j++ ) 
			{
				if(j<=5-i || j>=3+i)
				{
					if (j<4) 
					{
						System.out.print(n);
						n++;
					}
					else 
					{
						System.out.print(n--);
								
			
					}
						
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