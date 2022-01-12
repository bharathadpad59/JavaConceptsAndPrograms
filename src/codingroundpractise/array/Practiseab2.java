package codingroundpractise.array;

class Practiseab2
{
	public int gratest(int[] a)
	{
		
		int max=a[0];
		for (int i=1;i<a.length;i++ ) 
		{
			
				if (max<a[i]) 
				{
				 	max=a[i];
				}
				
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] a={9,2,3,4,8,5,6,7};
		int b=new Practiseab2().gratest(a);
		System.out.println(b);
	}
}