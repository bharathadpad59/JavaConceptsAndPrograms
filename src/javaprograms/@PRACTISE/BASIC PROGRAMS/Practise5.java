import java.util.Scanner;
class Practise5
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to calculate LCM =");
		int a= scn.nextInt();
		int b= scn.nextInt();

			int z=a>b?a:b;
		for (int i=z;i<=a*b ;i++) 
		{
			if (i%a==0 && i%b==0)
			{
				System.out.println(i);
				break;
			}
		}

	}
}