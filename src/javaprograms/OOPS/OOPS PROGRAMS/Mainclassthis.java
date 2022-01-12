class Sample
{
	public Sample()
	{
		this(10);
		System.out.println("This is sample()");
	}

	public Sample(int x)
	{
		System.out.println("This is sample(int x)");
	}
}

class Mainclassthis
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();

	}
}