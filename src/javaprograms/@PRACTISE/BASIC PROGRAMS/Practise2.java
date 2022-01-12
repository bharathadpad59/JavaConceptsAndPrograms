import java.util.Scanner;
class Practise2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number =");
		
		int a=scn.nextInt();
		int count =0;							// no of digits in given no
		while (a!=0)
		{                                 //   a/b means == Quotient   // a%b means== remainder
			a=a/10;
			System.out.println(a);
			count++;
		}

		System.out.println("count is ="+count);
	}
}

