package codingroundpractise.array;

class Practise20
{
	public static void main(String[] args) 
	{
		int [] a={10,20,20,20,30,30,40,50,50};

		int [] b= new int [a.length];

		int k=0;
		for (int i=0;i<a.length;i++) 
		{
			for (int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])                                   // no use
				{	
					for (k=0;k<b.length;k++) 
					{
						if (b[k]!=a[j]) 
						{
							b[k]=a[j];
							k++;
						}
			
					}			
				}
			}
			if (b[i]!=0) 
			{
				System.out.print(b[i]);
			}
			
			
		}

		
		
	}
}