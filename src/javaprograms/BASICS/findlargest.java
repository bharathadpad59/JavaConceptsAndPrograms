class findlargest
{
	public static int findlargest(int n1,int n2)
	{
	if(n1>n2)
	{
		return n1;
	}
	else
	{
		return n2;
	}
	}
public static void main(String[] args) 
	{
	System.out.println("Program starts.............");
	double res;
	int large;
	large=findlargest(35,45);
	res=210*large;	
	System.out.println(res);
	System.out.println("program ends..............");
	}
}
