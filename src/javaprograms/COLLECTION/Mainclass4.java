import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
class Mainclass4
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

		HashSet hs1=new HashSet(alist);  //HashSet(Collection c)=constructs a new HashSet containing the elements in 
		      							// the given collection

		Iterator i1=hs1.iterator();


		while(i1.hasNext()==true)    // we can use for loop here hs1.size and i1.next(i)
		{
			System.out.println(i1.next());
		}

		System.out.println("Program ends......");
	}
}
