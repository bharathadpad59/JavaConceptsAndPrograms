class Array1
{
	public static void main(String[] args) 
	{
	

		System.out.println("PROGRAM STARTS........");
		int[] marks=new int[4];
		double sum=0.0;
		double avg =0.0;
		System.out.println(marks);



		marks[0]=45;
		marks[1]=47;
		marks[2]=45;
		marks[3]=54;

		for (int index=0;index<=3 ;index++ ) 
		{
		sum=sum+marks[index];
		}
		avg=sum/4;
		System.out.println(avg);
	}
}