class Mainclass2
{
	public static void test(int num) 
	{
		System.out.println("Entering test()");

		int[] a1={10,20,30,40};

		try
		{									// UNCHECKED EXCEPTIONS  I.E  RUNTIME EXCEPTIONS
			System.out.println(a1[num]);
			int res=50/num;
			System.out.println(res);
			System.out.println(a1[num]);		
		}

		catch(Exception ex)	// method of supermost class i.e Exception class by using this method 
		{					// we can get any exception  automaticaldisplayed
			ex.printStackTrace();	
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
			System.out.println("-------------------");
			test(2);
			System.out.println("\n\n");

			System.out.println("PROGRAM ENDS................\n");
		}

}
