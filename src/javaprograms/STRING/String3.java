class String3
{
	public static String test(String a1 ) 
	{
		char exm;
		StringBuffer sb= new StringBuffer();

		String res="";//empty string  is keyword so; cant take res OF UR choice
		int mid=(a1.length()-1)/2;
		for (int i=1;i<a1.length()-1 ;i++) 
		{
			exm=a1.charAt(i);
			sb.append(exm);	
			res=res+a1.charAt(i);
		}
		System.out.println(sb);
		return res;
		
	}

		public static void main(String[] args) 
		{
			String s = "bharathadpad";
			String s1=test(s);
			System.out.println(s1);
		}

	}
