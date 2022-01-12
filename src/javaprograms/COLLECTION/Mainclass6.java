import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ArrayList;
class Mainclass6
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..........");

		ArrayList alist=new ArrayList();

		alist.add("Bharat");
		alist.add("Basavraj");
		alist.add("Shekhrappa");
		alist.add("Shakuntala");
		alist.add("Bharat");

		for (int i=0;i<alist.size();i++) 
		{
			System.out.println(alist.get(i));
		}
		System.out.println("-------------------------------------");




		HashSet hs1=new HashSet(alist);

		Iterator i1=hs1.iterator();


		while(i1.hasNext()==true)    // we can use for loop here hs1.size and i1.next(i)
		{
			System.out.println(i1.next());
		}

		System.out.println("------------------------------------");




		LinkedHashSet lhs1=new LinkedHashSet(alist);  //LinkedHashSet(Collection c)=will constructs a new LinkedHashSet containing the elements in 
		lhs1.add("papa");								// the given collection.
		lhs1.add("mummy");
		lhs1.add("bhai");
		lhs1.add("papa");

		Iterator i2=lhs1.iterator();


		while(i2.hasNext()==true)    // we can use for loop here hs1.size and i1.next(i)
		{
			System.out.println(i2.next());
		}

		System.out.println("Program ends......");
	}
}
