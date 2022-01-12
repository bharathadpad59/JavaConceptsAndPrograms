import java.util.Scanner;
class Practise9
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to calculate Prime factorials =");
		int a= scn.nextInt();
		
	for (i=2;i<=a ;i++ ) 
	{
		while(a%i==0)
		{
			System.out.println(i);
			a=a/i;
		}
	}

	}
}