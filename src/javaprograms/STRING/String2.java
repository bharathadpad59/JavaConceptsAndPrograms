class String2
{
	public static String test(String a1 ) 
	{
		String res="";//empty string is keyword so cant take res of  ur choice
		int mid=(a1.length()-1)/2;
		for (int i=0;i<a1.length()-1 ;i++) 
		{
			res=res+a1.charAt(i);
		}
		return res;
	}

		public static void main(String[] args) 
		{
			String s = "bharathadpad";
			String s1=test(s);
			System.out.println(s1);
		}

	}
