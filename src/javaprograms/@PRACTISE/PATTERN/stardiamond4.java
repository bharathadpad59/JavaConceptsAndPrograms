class stardiamond4
{
	public static void main(String[] args) 
	{
		
	for (int i=1;i<=7 ;i++ ) 
	{

	for (int j=1;j<=7 ;j++ ) 
		{

			if (i<4)
				{

					if(j>=5-i && j<=3+i)
					{
						System.out.print('*');

	
					}	
					else
					{
						System.out.print(" ");
					}
				
				
				 }
			else
			   {
				//for (int j>=1;j<=7 ;j++ ) 
				//{

					if (j>=i-3 && j<=11-i) 
					{
						System.out.print('*');
				
					}
					else 
					{
						System.out.print(" ");
					}
					
				}

				System.out.print(" ");

			}
			System.out.println(" ");
		}
	}
}