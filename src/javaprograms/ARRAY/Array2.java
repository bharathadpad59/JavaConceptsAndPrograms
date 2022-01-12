class Array2
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		double sum=0.0;
		double avg=0.0;
		a[0]=20;//a={10,20,30,40,50}
		a[1]=10;
		a[2]=30;
		a[3]=78;
		a[4]=80;

		for (int i=0;i<5 ;i++ ) 
		{
			sum=sum+a[i];
		}
			avg=(sum/5)*100;
			System.out.println(avg);
	}
}