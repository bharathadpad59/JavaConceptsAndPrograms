import java.util.Scanner;
class Practise8
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to calculate Prime nos in Range =");
		int a= scn.nextInt();
		int b=scn.nextInt();

		System.out.println("Prime nos in between" +a+ "and" +b+ "is ");
		for (j=a;j<=b ;j++) 
		{
			for (i=2;i<j;i++)
			{
				if (j%i==0)
			    break;
			}

			

			if (i==j) 
			System.out.println(j);
		}

	}
}