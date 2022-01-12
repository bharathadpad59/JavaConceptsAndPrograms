class abhi1
{
	public static void main(String[] args) 
	{
		int total=345;
		int attd=300;
		System.out.println(" If medical issue type Yes else No");
		String medical="Yes";
		double percentage=(attd*100)/total;
		if(percentage>75)
		{
			System.out.println("Allowed to sit");
		}
		else if (percentage<75 )
		{
			if (medical=="Yes") 
			{
				System.out.println("Allowed for examination");
			}
			else
			{
			System.out.println("Not allowed to sit");	
			}
		}
		
		else 
		{
			System.out.println("Not allowed to sit");
		}
			
	}
	
}