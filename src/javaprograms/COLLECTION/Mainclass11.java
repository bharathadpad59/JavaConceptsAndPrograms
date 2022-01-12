import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Mainclass11
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS.............");

		HashMap hm1=new HashMap();
		hm1.put(123,"A");
		hm1.put(456,"B");
		hm1.put(789,"C");
		hm1.put(234,"D");
		hm1.put(567,"E");
		hm1.put(890,"F");

		Set key=hm1.keySet();
		

		Iterator i1=key.iterator();

		while(i1.hasNext()==true)
		{
			System.out.println(hm1.get(i1.next()));  
		}

	}
}