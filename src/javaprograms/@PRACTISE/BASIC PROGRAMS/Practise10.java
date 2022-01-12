import java.util.Scanner;
class Practise10
{
	public static void main(String[] args) 
	{
		int a=-1;
		int b=1;
		int c,x,i;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the nth term of fibonacci series");
		x=scn.nextInt();

		for (i=1;i<=x ;i++ ) 
		{	c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}