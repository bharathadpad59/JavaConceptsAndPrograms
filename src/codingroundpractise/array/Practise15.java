
class Practise15
{
	public static void main(String[] args) 
	{
		int max;
	
		int [] a={10,11,14,18,16,21,36,38,2};

				max=a[0];
		for (int i=1;i<a.length;i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println("Greatest no is ="+max);
	}
}