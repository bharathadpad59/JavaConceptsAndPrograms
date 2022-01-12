import java.util.Scanner;	
class Program10
{
	static int count=0;
	public static void Function(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length()-1;j++)
			{
					if(str.charAt(i)==str.charAt(j+1))
					{
						count++;
					}

			}
		}
		System.out.println("count is:" + (count));
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts....");
		System.out.println("enter your string: ");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Function(str);
		System.out.println("program ends...");	
	}
}
