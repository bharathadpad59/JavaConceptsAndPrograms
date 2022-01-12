class Practiseab1
{
	public int sum(int[] a)
	{
		int sumeven=0;
		int sumodd=0;
		for (int i=0;i<a.length;i++) 
		{
			if (a[i]%2==0) 
			{
				sumeven=sumeven+a[i];
			}
			else
			{
				sumodd=sumodd+a[i];
				
			}
		}
		System.out.println("sum of even no is ="+sumeven);
		return sumodd;
	}	
	public static void main(String[] args) 
	{
		int [] a={10,16,20,};
		Practiseab1 p1=new Practiseab1();
		int c=p1.sum(a);
		int b= new Practiseab1().sum(a);
		
			System.out.println("sum of odd no is ="+c);
			System.out.println("sum of odd no is ="+b);
		
	}
}