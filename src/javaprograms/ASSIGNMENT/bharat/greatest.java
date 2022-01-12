import java.util.Scanner;
class greatest
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner (System.in);
		System.out.println("write the valuefor A=");
		int a=scn.nextInt();
		System.out.println("write the valuefor B="); 
		int b=scn.nextInt();
		System.out.println("write the valuefor C=");
		int c=scn.nextInt();
		 	
		if (a>b) 
		{
			if (a>c) 
			{
				System.out.println("A is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		else if (b>c)
		{
			System.out.println("B is grestest");
		}
		else
		{
			System.out.println("C is greatest");
		}

	}
}