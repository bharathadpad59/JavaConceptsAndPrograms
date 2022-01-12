import java.util.Scanner;
class Practise3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number =");
																//sum of the digits of a givenno
		int a=scn.nextInt();
		int b;
		int c=0;
		
		while(a!=0)
		{
			b= a%10;	//322%10=2   // 32%10=2   // 3%10=3
			c=c+b;		// 0+2=2     // 2+2= 4     // 4+3=7
			a=a/10;		// 322/10=32  // 32/10=3   // 3/10=0
		}

		System.out.println("Rverse order of entered no is ="+c);
	}
}

