class Practiseab
{
	public static int[] array(int[] a) 
	{
		int j=a.length-1;
		int [] b= new int [a.length];
		for (int i=0;i<a.length;i++) 
		{
				b[i]=a[j];
				j--;
			
		}
		return b;		
	}
	public static void main(String[] args) 
	{
		int [] a={10,78,50};
		int [] b=array(a);
		for (int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
	}
}