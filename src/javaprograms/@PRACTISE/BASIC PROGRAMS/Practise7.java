import java.util.Scanner;
class Practise7
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to check Prime nos are not =");
		int a= scn.nextInt();								                // Check Prime nos

		if (a==1 || a==0) 
			{
			System.out.println("Not a Prime");	
			}

		for (int i=2;i<a ;i++) 
		{
			if (a%i==0)
			{ 
			System.out.println("Not a Prime");	
		    break;
		     }

			if (i==a)
			{
				System.out.println("Prime");
				break;
			}
	
		}
	}
}