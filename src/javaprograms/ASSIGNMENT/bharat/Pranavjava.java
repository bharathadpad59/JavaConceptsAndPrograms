class learningjava
{
	public  void addition(int a,int b) 
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void subtract(int c,int d) 
	{
		int sub=c-d;
		System.out.println(sub);
	}

	public  void multiply(int e,int f) 
	{
		int mul=e*f;
		System.out.println(mul);
	}

}

class Pranavjava
{
	public static void main(String[] args) 
	{
		learningjava ref1=new learningjava();
		ref1.addition(10,20);

		learningjava.subtract(100,20);

		ref1.multiply(2,30);
	}
}