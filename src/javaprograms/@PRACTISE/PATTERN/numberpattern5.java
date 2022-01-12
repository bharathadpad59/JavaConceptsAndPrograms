class numberpattern5
{
	
	public static void main(String[] args) 
	{
		
	for (int i=1;i<=4 ;i++ ) 
	{
		int n=1;
	for (int j=1;j<=7 ;j++ ) 
		{
		  if (j>=5-i && j<=3+i)
		  { 

		  //	j<4?System.out.print(n++);:System.out.print(n--);
		    if (j<4)
    		 	{
					System.out.print(n++);

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