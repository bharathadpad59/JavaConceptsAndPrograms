class Marks
{
	public static void main(String[] args)
	 {
		int marks=89;
		if(marks>=70 && marks<=100)
		{
			System.out.println("First class division");
		}
		else if(marks>=60 && marks<=69)
			{
				System.out.println("Distinction");
			}
		else if(marks >=50 && marks <=59)
		{
			System.out.println("Second Class");
		}	
		else if(marks<=35 && marks<=49)	
		{
			System.out.println("Just pass");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("FAil");
		}
		else
		{
			System.out.println("Invalid Number");
		}
	
	}
	
}