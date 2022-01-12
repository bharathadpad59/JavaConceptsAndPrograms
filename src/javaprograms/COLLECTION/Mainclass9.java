import java.util.PriorityQueue;
import java.util.Iterator;

class Mainclass9
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS.............");

		PriorityQueue pq1=new PriorityQueue();
		pq1.add("Android");
		pq1.add("frontend");
		pq1.add("dotnet");
		pq1.add("Android");
		pq1.add("erp");
		pq1.add("c");

		System.out.println("size="+pq1.size());

		while(pq1.size()!=0)
		{
			System.out.println(pq1.poll());  // here we cant use iterator because it will randomly throw values and 
											//we want ordered values as prioritylist is there
											
		}

		System.out.println("size="+pq1.size());
	}
}