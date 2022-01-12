class Practise14
{
	public static void main(final String[] args) 
	{
		double sumeven=0;
		double sumodd=0;
		final int [] a={10,11,14,18,16,21,36,38,2};

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
		System.out.println("sum of odd no is ="+sumodd);
	}
}