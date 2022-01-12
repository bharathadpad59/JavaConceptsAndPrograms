class Practise1
{
	public static int check(String a1) 
	{
		int count=0;

		for (int i=0;i<a1.length();i++) 
		{
			if (a1.charAt(i)!=' ') 		// program to count no of characters in a string not length in a string
			{
				count++;
			}										// 6,7,8,9 substring problems
		}
		return count;
	}
	public static void main(String[] args) 
	{
		String s1="BHARAT HADPAD";

		int counting=check(s1);
		System.out.println(counting);
	}
}