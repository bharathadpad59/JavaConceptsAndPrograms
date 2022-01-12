class Arrayavg
{
	public static double avg(int[] a1) 
	{
		double sum=0.0;
		double avg=0.0;
		int x=0;

		for (int index=0;index<a1.length-1;index++ ) 
		{
			if(index%2==0)
			{
			    sum=sum+a1[index];
				x++;
			}
		}
		avg=sum/x;
		return avg;
	}




	public static void main(String[] args) 
	{
		int [] a={10,20,30,40};
		double b=avg(a);
		System.out.println(b);
	}
}