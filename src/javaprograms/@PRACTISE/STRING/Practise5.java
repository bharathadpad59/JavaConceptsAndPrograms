class Practise5
{
	public static void main(String[] args) 
	{
		String a1="abcde";
		String a2="deabc";

		a1=a1.concat(a1);   // a1=a1+a1;
		                                      // to find one string is rotation of another or not
		/* char[] result=new char[10];
		char[] str1 = a1.toCharArray();
		char[] str2 = a2.toCharArray();

		System.arraycopy(str1, 0, result, 0, a1.length());
        System.arraycopy(str2, 0, result, a1.length(), a2.length());

        /*
        System.arraycopy(str1, 0, result, 0, 5);
        System.arraycopy(str1, 0, result, 5, 5);
        */

		

        if(a1.indexOf(a2)!=-1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");
	} 
}
	