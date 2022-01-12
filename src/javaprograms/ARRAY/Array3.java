class Array3
{
		public static double findavg(int[] marks) 
		{
			double sum=0.0;
			double avg=0.0;
	
			System.out.println("length="+marks.length);

			for (int index=0;index<marks.length ;index ++ ) 
			{
				sum=sum+ marks[index];
			}
			avg=sum/marks.length;
			return avg;
		
		}

		public static void main(String[] args) 
		{
			int [] javamarks={40,50,40,50};
			int [] sqlmarks={35,67,50,69,45,78};
			System.out.println(" java avg :"+findavg(javamarks));
			System.out.println(" Sql avg :"+findavg(sqlmarks));
		}
	
}