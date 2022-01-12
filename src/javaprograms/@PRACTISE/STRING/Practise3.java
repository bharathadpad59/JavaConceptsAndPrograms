import java.util.Arrays;
class Practise3
{
	public static void check(String a1,String a2) 
	{
		char temp;
		char temp1;

		char[] str1 = a1.toCharArray();      // program to find characters present in both strings are same or not
		char[] str2 = a2.toCharArray();

		if (a1.length()!=a2.length()) 
		{
			System.out.println("NOT AN ANAGRAM..");
		}


		if (a1.length()==a2.length()) 
		{
			for (int i=0;i<a1.length();i++) 
			{
				for (int j=i+1;j<a1.length();j++) 
				{
				   if (str1[i]>str1[j])
				    {
						temp=str1[i];
						str1[i]=str1[j];
						str1[j]=temp;
				    }

				    if (str2[i]>str2[j])
					{
						temp=str2[i];
						str2[i]=str2[j];                // to do all these we should use 
														//import java.util.Arrays;
						str2[j]=temp;
					}									// Arrays.sort(str1);  
                                                        // Arrays.sort(str2);
				}
			}

		
				/*
				for (int i=0;i<str1.length;i++)   //(Arrays.equals(str1, str2) == true);
				{
					if (str1[i]!=str2[i])
					{
						System.out.println("NOT AN ANAGRAM");
					}	
					else
					{
						System.out.println("ANAGRAM");
					}
				
				}
				*/
			
				if (Arrays.equals(str1, str2) == true)
					{
						System.out.println("ANAGRAM ");
					}	
					else
					{
						System.out.println("NOT AN ANAGRAM");
					}
				
				
				
		}
					
	}
	public static void main(String[] args) 
	{
		String s1="dam";	// a,b,b,r        grab
		String s2="mad";  //a,b,g,r           brag
		check(s1,s2);
	}
}