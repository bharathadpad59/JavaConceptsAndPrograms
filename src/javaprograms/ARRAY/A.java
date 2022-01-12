class Array6
{
		public static int[] copy(int[] a1) 
		{
			int [] b1=new int [a1.length];
			for(int index=0;index<a1.length;index++)
			{
				b1[index]=a1[index];
			}	

			return b1;
		}

		public static void main(String[] args) 
		{ 
			int i,j;
			int [] a1={40,50,40,50,60,70};
			for (i=0;i<a1.length ;i++ ) 
			{
				System.out.println(a1[i]);
			}
			int[] newarray=new int[a1.length];
			newarray=copy(a1);
			
				for (j=0;j<newarray.length ;j++ ) 
				{
					System.out.println(newarray[i]);
				}
				
			
			
		}
	
}