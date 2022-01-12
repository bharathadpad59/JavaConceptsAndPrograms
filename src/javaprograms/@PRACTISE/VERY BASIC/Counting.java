class Counting
{
	public static void main(String[] args) 
	{
		int count=0;
		String str="APPLE";

		for (int i=0;i<=str.length()-1 ;i++) 
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}