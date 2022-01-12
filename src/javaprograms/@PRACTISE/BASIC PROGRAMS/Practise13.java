import java.util.Scanner;
import java.math.*; 
class Program13
{
	public static void main(String[] args) 
	{
		int i=0;
		int sum=0;
		Scanner scn=new Scanner(System.in);

		int a= scn.nextInt();

		while (a!=0)
		{
			sum=sum+pow(Math.abs(2,i))*(a%10);
			a=a/10;
			i++;
		}
	}
}