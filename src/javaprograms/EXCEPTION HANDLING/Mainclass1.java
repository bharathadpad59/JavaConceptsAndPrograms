class Mainclass1
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
		}

		catch(ArithmeticException ae)
		{
			System.out.println("Caught ArithmeticException");
			System.out.println("Invalid numb for divisison");
		}

		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("caught ArrayIndexOutOfBoundsException");
			System.out.println("Invalid index");
		}

		System.out.println("Exit test()");
	}
	
		public static void main(String[] args) 
		{
			System.out.println("PROGRAM STARTS................\n\n");

			test(5);
			System.out.println("-------------------");

			test(0);
			System.out.println("PROGRAM ENDS................\n");
		}

}
