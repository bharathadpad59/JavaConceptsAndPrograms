class LowerUpperCase
{
	public static void main(String[] args) 
	{
		String str="bhAraT";		// A=65  a=97
		int temp;					// Z=91  z=123
		String ch=" ";

		
		for (int i=0;i<str.length();i++) 
		{
			temp=(int)str.charAt(i);
			if (temp>91) 
			{
				temp=temp-32;
			}
			else if(temp<=91)
			{
				temp=temp+32;
			}
			else
			{
				temp=temp;
			}
			
			ch=ch+(char)temp;
		}
		
		System.out.println(ch);

	}
}