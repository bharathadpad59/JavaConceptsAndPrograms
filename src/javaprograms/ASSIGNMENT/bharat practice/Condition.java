class Condition
{
		public static boolean copy(int[] a1) 
		{
			int [] b1=new int [a1.length];
			  for (int index=0;index<=a1.length-1 ;index++ ) 
			  {
			  	b1[index]=a1[index];
			  }
			  for (int index=0;index<=a1.length-1 ;index++ ) 
			    	if ((b1[index]%2)!=0) 
			    	{
			         return true;
			    	}
			    	else
			    	return false;
		    
		 }


		public static void main(String[] args) 
		{
			int [] a1={27,40,33,20,44,77};
			boolean b=copy(a1);
			System.out.println(b);
			
			
		}
	
}