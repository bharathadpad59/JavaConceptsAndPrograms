class ParseintArea
{
	public static void main(String[] args) 
	{
		System.out.println("enter base and height value to get area");
		int base=Integer.parseInt(args[0]);
		int height=Integer.parseInt(args[1]);
		double area=0.5*base*height;
		System.out.println(area);
		
	}
}