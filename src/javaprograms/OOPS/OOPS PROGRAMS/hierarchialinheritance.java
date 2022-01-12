class Android
{
	public static void Androidos() 
	{
		System.out.println("Mobile app feature");
	}
}
class samsung extends Android
{
	public static void Androidos1() 
	{
		System.out.println("samsung Mobile app feature");
	}
}
class oneplus extends Android
{
	public static void Androidos2() 
	{
		System.out.println("one-plus Mobile app feature");
	}
}
class motorola extends Android
{
	public static void Androidos3() 
	{
		System.out.println("Motorola Mobile app feature");
	}

}

class hierarchialinheritance
{
    public static void main(String[] args) 
    {
		samsung ref1=new samsung();
		ref1.Androidos1();
		ref1.Androidos();
		oneplus ref2=new oneplus();
		ref2.Androidos2();
		motorola ref3=new motorola();
		ref3.Androidos3();
		ref2.Androidos2();

	}
}
