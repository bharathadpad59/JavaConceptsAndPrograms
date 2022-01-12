class Practise10
{
	public static void main(String[] args) 
	{
		String s1="Big black bug bit a big black dog on his big black nose";
		
		s1= s1.toLowerCase();

		String words[] = s1.split(" ");           // Program to print duplicate WORDS 
		
		
		for(int i=0;i<words.length;i++) 
		{
			int count=1;
			for (int j=i+1;j<words.length;j++ ) 
			{
				if (words[i].equals(words[j])) 
				{
					count++;
					words[j]="0";
				}
			}

			if (count>1 && words[i]!="0") 
			{
				System.out.println(words[i]);
			}
				
		}
	}
}