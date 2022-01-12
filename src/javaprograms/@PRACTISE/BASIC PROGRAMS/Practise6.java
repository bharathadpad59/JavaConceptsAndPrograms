import java.util.Scanner;
class Practise6
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to calculate HCF =");
		int a= scn.nextInt();
		int b= scn.nextInt();

		int n=a<b?a:b;
		for (int i=n;i>=1 ;i--) 
		{
			if (a%i==0 && b%i==0)
			{
				System.out.println("\n"+i);
				break;
			}
		}

	}
}