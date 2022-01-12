
import java.util.ArrayList;
class Mainclass12GENERIC
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..........");

		ArrayList<String> a1=new ArrayList<String>();

		a1.add(new String("Bharat"));
		a1.add(new String("Basavraj"));
		a1.add("Shekharappa");
		a1.add("Shakuntala");


		for (int i=0;i<a1.size();i++) 
		{ 
			System.out.println(a1.get(i).length());// here we want length but it is present in string class so we have
		}// to downcast first into string i.e String s1=(String)a1.get(i) then s1.length();
		//but if we use generics it will work fine it will see the return type and arrange according to it.
		// whatever the notes are coming it also gone

		System.out.println("Program ends......");
	}
}