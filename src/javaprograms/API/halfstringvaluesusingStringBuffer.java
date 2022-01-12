package javaprograms.API;

class halfstringvaluesusingStringBuffer
{
	public static String test(String str) 
	{
		String res;
		StringBuffer sb1=new StringBuffer();
		int mid=(str.length()-1)/2;
		for (int i=0;i<=mid;i++) 
		{
			char c1=str.charAt(i);
			sb1=sb1.append(c1);
		}
		res=sb1.toString();
		return res;

	}
	public static void main(String[] args) 
	{
		String a1="BHARAT";
		String b1=test(a1);
		System.out.println("b1="+b1);

	}
}