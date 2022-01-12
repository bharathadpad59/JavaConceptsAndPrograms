import java.util.LinkedList;
import java.util.Iterator;

class Mainclass10
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS.............");

		LinkedList pq1=new LinkedList();
		pq1.add("A");
		pq1.add("B");
		pq1.add("C");
		pq1.add("D");
		pq1.add("E");
		pq1.add("F");

		System.out.println("size="+pq1.size());

		System.out.println(pq1.get(3));
		System.out.println("********************************");

		while(pq1.size()!=0)
		{
			System.out.println(pq1.poll());  // here we cant use iterator because it will randomly throw values and 
											//we want ordered values as stack DS so polllast();
			// so it will not only retrieve data in required order but also removes it from list.
											
		}


		System.out.println("size="+pq1.size());
	}
}