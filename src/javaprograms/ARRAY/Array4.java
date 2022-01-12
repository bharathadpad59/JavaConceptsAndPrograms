class Array4
{
		public static void findlength(int[] a1) 
		{
			

			int firstterm=0;
			int midterm=(a1.length-1)/2;
			int lastterm=(a1.length-1);
			System.out.println(a1[firstterm]);
			System.out.println(a1[midterm]);
			System.out.println(a1[lastterm]);
		}

		public static void main(String[] args) 
		{
			int [] a1={40,50,40,50};
			findlength(a1);
			
			
		}
	
}