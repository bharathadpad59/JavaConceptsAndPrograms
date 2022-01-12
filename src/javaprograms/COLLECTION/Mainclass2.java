import java.util.HashSet;
import java.util.Iterator;

class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..........");

		HashSet hs1=new HashSet();

		hs1.add(10);
		hs1.add(null);      // HashSet do no allows Duplicates,not have index,do not preserve insertion order
		hs1.add(20);		// allows only 1 null value
		hs1.add(10);
		hs1.add(null);

		Iterator i1=hs1.iterator();  // this method (iterator()) will return cursor on the given collection.

		while(i1.hasNext()==true)    		 // we can use for loop here hs1.size and i1.next(i)
		{
			System.out.println(i1.next());
		}
		System.out.println("Program ends......");
	}
}
