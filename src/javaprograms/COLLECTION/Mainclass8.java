import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class Desorder implements Comparator 
{
	@Override                                             
	public int compare(Object obj1,Object obj2) // customised sorting according to DESCENDING order

	{
		String str1=(String)obj1;
		String str2=(String)obj2;

		int res=str2.compareTo(str1);// we are downcasting becauz compareTO() & compare() both present in STRING CLASS
		return res;
	}
}

class LenOrder implements Comparator // custom sorting through diff classes according to  LENGTH
{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		String str1=(String)obj1;// we have to compare length because we r creating our own method to compare i.e 
		//custom sorting and hence we needed length which is presnt in string class only thats why we downcasted and 
		//then compares got it ? so now sending its ref variable in TREESET we can compare values and do customized sorting!
		String str2=(String)obj2;

		return str1.length()-str2.length();
	}
}





class Mainclass8
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS.............");

		Desorder d1=new Desorder(); //it will give in order arrangement
		LenOrder l1=new LenOrder();//customised sorting done by creating object and writing logic into it, we can do.
					// it will give customised order arrangement


		TreeSet ts1=new TreeSet(d1);

		ts1.add("Android");
		ts1.add("frontend");
		ts1.add("dotnet");
		ts1.add("Android");
		ts1.add("erp");
		ts1.add("c");

		Iterator i1=ts1.iterator();

		while(i1.hasNext()==true)
		{
			System.out.println(i1.next()); 
		}

		System.out.println("PROGRAM ENDS....");
	}
}
