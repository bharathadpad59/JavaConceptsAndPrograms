class Practise16
{
	public static void main(String[] args) 
	{
		int [] a={10,10,14,10,11,21,36,38,21};

		int[] b=new int[a.length];
		for (int i=0;i<b.length;i++) 
		{
			b[i]=-1;
		}

		for (int i=0;i<a.length;i++) 
		{
			int count=1;
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

		System.out.println("Duplicates array are");
		for (int i=0;i<a.length ;i++) 
		{
			if (b[i]!=0) 
			{
				System.out.println(a[i]+" repeats "+b[i]);
			}
		}
	}
}