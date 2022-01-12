import java.util.Scanner;
class Practise1
{
	private static String z="bharat";
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number =");
		
		int a=scn.nextInt();						// reverse order of given no
		int b;
		int c=0;
		
		while(a!=0)
		{
			b= a%10;
			c=c*10+b;
			a=a/10;
		}

		System.out.println("Rverse order of entered no is ="+c);
		z="basavraj";
		System.out.println("Reinitiali status ="+z);

	}
}

