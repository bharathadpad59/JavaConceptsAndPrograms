import java.util.Scanner;

class Practise12
{
	public static void main(String[] args) 
	{	
		int a=2;											// Co-prime nos from 1 to n
		int b,i,j,x,min,range;
		Scanner scn=new Scanner(System.in);

		System.out.println("Ener the nos to see pair of Co-Prime nos");
		range= scn.nextInt();

		while(range!=0)
		{
			for (b=2;b<=a;b++) 
			{									
				x=a<b?a:b;
				for (i=2;i<x;i++)
				{										// Co-Prime nos check of 2 nos
					if (a%i==0 && b%i==0)
					break;
				}
				if (i==x)
				{ 
				System.out.print(a);
				System.out.print(b);
				System.out.println(" ");
				range--;
				a++;
				}

			}

		}	
		
	}
}