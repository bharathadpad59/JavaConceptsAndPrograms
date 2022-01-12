class Android
{
		int v=10;
	public static void Androidos() 
	{
		System.out.println("Android official Mobile app feature");
	}
}
class samsung extends Android
{
	@Override
	public static void Androidos() 
	{
		System.out.println("samsung Mobile app feature");

	}
}
class oneplus extends Android
{
	public static void Androidos() 
	{
		System.out.println("one-plus Mobile app feature");
	}
}
class motorola extends Android
{

}

class methodoridewihierarchialinherit
{
    public static void main(String[] args) 
    {
		samsung ref1=new samsung();
		ref1.Androidos();
		System.out.println(ref1.v);

		motorola ref3=new motorola();
		ref3.Androidos();

	}
}
