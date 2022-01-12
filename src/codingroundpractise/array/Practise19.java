package codingroundpractise.array;

class Practise19
{
	public static void main(String[] args) 
	{
		int temp;
	
		int [] a={10,20,10,40,60,10,20};
		int [] b=new int[a.length];

		for (int i=0;i<a.length;i++ ) 
		{
			b[i]=-1;
		}

		for (int i=0;i<a.length;i++) 
		{
			int count=0;
			for (int j=i+1;j<a.length;j++) 
				{
					if (a[i]==a[j]) 
					{
						count++;
						
						b[j]=0;
					}
				}
		
			if (b[i]!=0) 
			{
				b[i]=count;

			}
		}

		System.out.println("Numbers which are repeated are");
		for (int i=0;i<a.length ;i++) 
		{
			if (b[i]!=0 && b[i]>0) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}
			
}