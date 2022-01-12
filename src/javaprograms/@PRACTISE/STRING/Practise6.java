class Practise6
{
	public static void main(String[] args) 
	{
		String a1="abcde";
		String a2="deabc";							// adding all elements into a new single array
		

		char[] result=new char[10];
		char[] str1 = a1.toCharArray();
		char[] str2 = a2.toCharArray();
		int k=str1.length;


		for (int i=0;i<str1.length;i++) 
		{
			result[i]=str1[i];
			result[k]=str2[i];
			k++;
		}
		/*for (int i=0;i<str1.length;i++) 
		{
			
		}*/
		

		for (int i=0;i<result.length;i++) 
		{
			System.out.print(result[i]); 
		}
		
	}
}