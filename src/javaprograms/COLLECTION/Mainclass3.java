import java.util.HashSet;
import java.util.Iterator;
class Mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..........");

		HashSet hs1=new HashSet();

		hs1.add("Bharat");
		hs1.add("Basavraj");
		hs1.add("Shekharappa");
		hs1.add("Shakuntala");

		Iterator i1=hs1.iterator();

		while(i1.hasNext()==true)    // we can use for loop here hs1.size and i1.next(i)
		{
			System.out.println(i1.next());
		}

		System.out.println("Program ends......");
	}
}
