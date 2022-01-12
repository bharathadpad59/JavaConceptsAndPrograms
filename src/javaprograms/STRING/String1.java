class String1
{
	public static boolean test(String a1 ) 
	{
		

		int check=a1.length();
		System.out.println(check);
		char ch=a1.charAt(2);
		System.out.println(ch);
		if (check%2==0) 
		{
			return false;
		}
		else {
			return true;
		}
	}

		public static void main(String[] args) 
		{
			String s = "bharathadpad";
			boolean s1=test(s);
			System.out.println(s1);
		}

	}
