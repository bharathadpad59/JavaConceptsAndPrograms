class Array5
{
		public static void findsum(int[] a1) 
		{
			
			
			int secterm=1;
			int midterm=(a1.length-1)/2;
			int lastsecondterm=(a1.length-2);
			int sum=a1[secterm]+a1[midterm]+a1[lastsecondterm];
			
			System.out.println(sum);
		}

		public static void main(String[] args) 
		{
			int [] a1={1,2,3,4,5,6,7};
			findsum(a1);
		
		}
	
}