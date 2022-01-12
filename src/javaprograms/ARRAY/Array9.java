class Array9
{
		public static int[] copy(int[] a1) 
		{
			int [] b1=new int [a1.length];
			for(int index=1;index<=a1.length-2;index++)
			{
				b1[index]=a1[index];
			}	

			return b1;
		}

		public static void main(String[] args) 
		{
			int [] a1={40,50,40,50,60,70};
			int[] b=copy(a1);
			for (int i=0;i<=a1.length-2 ;i++ ) 
			{
				System.out.println(b[i]);
			}
			
		}
	
}