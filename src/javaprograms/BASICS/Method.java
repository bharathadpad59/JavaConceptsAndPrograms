class Method
{
	public static void calarea(int rad)
	{
		double area;
		area=3.14*rad*rad;
		System.out.println("Area is"+area);
		return;
	}

public static void main(String[] args)
	 {
		System.out.println("Program strts......");
		calarea(30);
		System.out.println("Program ends.......");
	 }
}