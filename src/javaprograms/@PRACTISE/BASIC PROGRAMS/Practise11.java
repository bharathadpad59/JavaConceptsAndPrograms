import java.util.Scanner;

class Practise11
{
	public static void main(String[] args) 
	{
		int i,j,x;
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to see Co-Prime nos are there or not");
		int a= scn.nextInt();
		int b=scn.nextInt();
	
		x=a<b?a:b;
			for (i=2;i<x;i++)
			{							// Co-Prime nos check of 2 nos
			if (a%i==0 && b%i==0)
			break;
			}

			if (i==x) 
			{
			System.out.println("Co-Prime");
			}
		    else
			System.out.println("Not a Co-prime");

		

	}
}