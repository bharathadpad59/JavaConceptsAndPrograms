class TSAofCylinder
{
	public static void main (String[] args)
	{
		System.out.println("Total Surface Area of Cylinder");
		float surfacearea, radius=3.0f, height=7.0f;
		surfacearea= 2.0f* radius*height + 2.0f * 3.142f * radius* radius;
		System.out.println("Radius of Cylinder is "+radius);
		System.out.println("Height of Cylinder "+height);
		System.out.println("TSA of cylinder is "+surfacearea);
	}
}