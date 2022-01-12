import java.util.Scanner;
class sum
{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int  add=0;
		int n=scn.nextInt();
		System.out.println("Enter the last natural no");
		for(int i=0;i<=n;i++)
		{
			if (i%2==0) 
			{
				add=add+i;
			}
		}
		System.out.println("sum is ="+add);
	}
}