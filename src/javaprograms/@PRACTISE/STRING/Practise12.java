class Practise12
{
	public static void main(String[] args) 
	{
		String s1="Shakuntala Bharat Shekhar Basavraj Shekhar Shekhar Shakuntala Shekhar";

		s1=s1.toLowerCase();


		String [] words=s1.split(" ");
		int[] values=new int[words.length];

		for (int y=0;y<values.length;y++) 
		{
			values[y]=-1;
		}

		for (int i=0;i<words.length;i++) 
		{    
			int count=1;
			for (int j=i+1;j<words.length;j++) 
			{
				if (words[i].equals(words[j])) 
				{
					count++;
					values[j]=0;
				}
			}

			if (values[i]!=0 && count>1) 
			{
				values[i]=count;
				System.out.println(words[i]);
			}
			
		}

		int large=values[0];

		for (int k=0;k<words.length;k++) 
		{
			if (large<values[k]) 
			{
				large=values[k];
			}
		}
		System.out.println("Largest length ="+large);

		for (int z=0;z<words.length;z++) 
		{
			if (values[z]==large) 
			{
				System.out.println(words[z]);
			}
		}

	}
}