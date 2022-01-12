class check
{
	public static void main(String[] args) {
		String str1="bharat";
		
		char temp;
		char[] string1 = str1.toCharArray();  
     
     	for (int i=0;i<string1.length;i++) 
		{
			for (int j=i+1;j<string1.length;j++) 
			{
				if(string1[i]>string1[j])
				{
					temp=string1[i];
					string1[i]=string1[j];
					string1[j]=temp;
				}
			}
			
		}
		for (int i=0;i<string1.length;i++) 
		{
			System.out.println(string1[i]);
		}
		
	}
}