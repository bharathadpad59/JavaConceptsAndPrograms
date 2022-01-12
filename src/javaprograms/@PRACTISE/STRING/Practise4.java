class Practise4
{
	public static char[] check(String a1) 
	{
		char[] str=a1.toCharArray();
		char temp='-';

		for (int i=0;i<str.length;i++) 
		{
			if (str[i]==' ') 		// program to replace empty spaces of a string with -;
			{
				str[i]=temp;
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String s1="BH AR AT HA DP AD";

		char [] result=check(s1);
		for (int i=0;i<result.length;i++) 
		{
			System.out.print(result[i]);	
		}
		
	}
}