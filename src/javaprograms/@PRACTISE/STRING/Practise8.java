class Practise8
{
	public static void main(String[] args) 
	{
		String s1="123451982";
		
		char[] str1=s1.toCharArray();            // Program to print duplicate elemnts only
		
		
		for(int i=0;i<str1.length;i++) 
		{
			int count=1;
			for (int j=i+1;j<str1.length;j++ ) 
			{
				if (str1[i]==str1[j]) 
				{
					count++;
					str1[j]=0;
				}
			}

			if (count>1 && str1[i]!=0) 
			{
				System.out.println(str1[i]);
			}
				
		}
	}
}