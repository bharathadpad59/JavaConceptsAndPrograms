class basic
{
	public static void main(String[] args) {
		String a="bharat";
		String b=new String("bharat");
		String c="bharat";


	if (a==b) 
	{
		System.out.println("true a==b");
	// if u compare gven 2 string objects using == it will compare address of the given 2 string objects.
	}// here (a) object pesent in constant pool and (b) obj is present in non constant pool so a!=b and therefore false.
     // but a and c object pt to same object in constant pool ie same address no so showing true.
		if (a==c) 
		{
			System.out.println("true next one a==c");
		}
		else
		{
			System.out.println("false");
		}
	}
}