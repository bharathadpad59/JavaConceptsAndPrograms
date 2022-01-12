class array
{
	private int [] a=new int [3];
	private int size=0;
	private int top=-1;


	public void push(int value)
	{
		if(size<5)
		{
			a[++top]=value;
			size++;
		}
		else
		{
			System.out.println("Invalid");
		}
	}

	public int size()
	{
		return size;
	}
}


class Arraycheck2
{
	public static void main(String[] args) 
	{
		array a1=new array();

		System.out.println(a1.size());
		a1.push(10);
		a1.push(20);
		System.out.println(a1.size());


	}
}