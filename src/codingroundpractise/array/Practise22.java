class Practise22
{
	public static void main(String[] args) 
	{

		int rows,cols,rows1,cols1;

		 String a[][] = {  
                          {"0", "0", "0", "0", "1", "0", "0", "0", "0"},  
                          {"0", "0", "0", "1", "0", "1", "0", "0", "0"},
                          {"0", "0", "1", "0", "1", "0", "1", "0", "0"},
                          {"0", "1", "0", "1", "0", "1", "0", "1", "0"},
                          {"1", "0", "1", "0", "1", "0", "1", "0", "1"}

                            
                       }; 

       for (int i=0;i<=a.length;i++) 
      {
       	 for (int j=0;j<=a[0].length;j++) 
         {
       		
       			System.out.print(a[i][j]+" ");
          }
              System.out.println(" ");
	     }


    }
}