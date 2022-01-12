interface Run
{
	int v1=20;
	public void test();
}

class superclass implements Run
{
	@Override
	public void test()
	{
		System.out.println("Printing superclass()");
	}
}

class Interfaceconcept
{
	public static void main(String[] args) 
	{
		superclass s1=new superclass();
		s1.test();
		System.out.println(s1.v1);
	}
}
