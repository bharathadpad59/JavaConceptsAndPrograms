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
			int [] a1={40,50,40,50,60,70};
						for (int i=0;i<a1.length ;i++ ) 
			{
				//System.out.println(a1[i]);
			}
			int[] b=copy(a1);
;
			
				for (int j=0;j<b.length ;j++ ) 
				{
					System.out.println(b[j]);
				}
				
		}
	
}