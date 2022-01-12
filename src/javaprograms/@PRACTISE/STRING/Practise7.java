class Practise7
{
	public static void main(String[] args) 
	{
		String s1="BHAAAAAAAAAAAARRAH";

		char[] str1=s1.toCharArray();
                                       // program to print duplicate elements ,frequency, (MAX,MIN) Repeatation
		int[] b=new int[str1.length];

		
		for (int i=0;i<str1.length;i++) 
		{
			b[i]=-1;
		}

		for (int i=0;i<str1.length;i++) 
		{
			int count=1;
			for (int j=i+1;j<str1.length;j++) 
			{
				if (str1[i]==str1[j]) 
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

		for (int i=0;i<str1.length ;i++) 
		{
			if (b[i]!=0) 
			{
				System.out.println(str1[i]+" repeats "+b[i]);
			}
		}

		char minchar;
		char maxchar;




		int[] str2=new int[str1.length];
		for (int i=0;i<str1.length ;i++) 
		{
			if (b[i]!=0) 
			{
					str2[i]=b[i];
			}
			System.out.print(str2[i]);
		}

		System.out.println("\n");
		for (int i=0;i<str1.length ;i++) 
		{
			System.out.print(b[i]);
		}

		
		int max=str2[0];
		int min=str2[0];

		for (int i=1;i<str1.length;i++) 
	{
		if (str2[i]!=0) 
		{
			if (max<str2[i]) 
			{	
				max=str2[i];	
			}
			

			if (str2[i]<min) 
			{
				min=str2[i];
			}
		}
			
	}
	System.out.println("max="+max);
	System.out.println("min="+min);

		for (int i=0;i<str1.length ;i++) 
		{
			if (str2[i]==max) 
			{
				//System.out.println("i max="+i);
				System.out.println("Maxrepation by="+str1[i]);
			}
				if (str2[i]==min) 
			{
				//System.out.println("i min="+i);
				System.out.println("Minrepitions by="+str1[i]);
			}
		}		
	}
}