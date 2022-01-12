class Practise2
{
	public static int check(String a1) 
	{
		int count=0;

		for (int i=0;i<a1.length();i++) 
		{
			if (a1.charAt(i)== ':'||a1.charAt(i)=='?'||a1.charAt(i)=='&'||a1.charAt(i)=='%') 		
			{
				count++;			//// program to count no of symbols and punctuations in a string 
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		String s1="BH%AR:AT&HAD&PAD";

		int counting=check(s1);
		System.out.println(counting);
	}
}