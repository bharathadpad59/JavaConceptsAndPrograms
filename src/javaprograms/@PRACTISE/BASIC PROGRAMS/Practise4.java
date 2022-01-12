
class Practise4
{
	public static void main(String[] args) 
	{
		System.out.print("Armstrong no = ");
		for (int i=1;i<=1000 ;i++ ) 
		{
			int c=0;
			int x=i;					// Armstrong nos
			while(x!=0)
			{
				int b= x%10;
				c=c+b*b*b;
				x=x/10;
			}
			if (c==i) 
			{
				System.out.println(i);

			}
		}
	}
}