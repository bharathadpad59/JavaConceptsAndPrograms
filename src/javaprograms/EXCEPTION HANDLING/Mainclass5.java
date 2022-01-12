class Mainclass5
{
	public static void test(int num) 
	{
		System.out.println("Entering test()");

		int[] a1={10,20,30,40};

		try
		{
			System.out.println(a1[num]);
			int res=50/num;
			System.out.println(res);
			System.out.println(a1[num]);		
		}

		catch(Exception ex)			// method of supermost class i.e Exception class by using this method we can get any exception 
		{									// automaticaldisplayed
			ex.printStackTrace();	
		}

		finally
		{
			int a=num*325;
			System.out.println(a);
			//System.out.println(a1[num]); exception will show here in 1st test(5) only,and furthue code will not run
		}
		System.out.println("Exit test()");	
	}

	
		public static void main(String[] args) 
		{
			System.out.println("PROGRAM STARTS................\n\n");

			test(5);
			System.out.println("-------------------");
			test(0);
			System.out.println("\n\n");

			System.out.println("PROGRAM ENDS................\n");
		}

}
