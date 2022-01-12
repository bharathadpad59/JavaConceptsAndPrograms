import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class student
{
	int rollno;
	String name;

	public student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public String toString()
	{
		return rollno + " "+ name;
	}



}

class Mainclass12
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS.............");

		HashMap h=new HashMap();
		// hm1.put(123,"A");
		// hm1.put(456,"B");
		// hm1.put(789,"C");
		// hm1.put(234,"D");
		// hm1.put(567,"E");
		// hm1.put(890,"F");
		student s1=new student(1,"Bharat");
		student s2=new student(2,"Basavraj");
		h.put(1,s1);
		h.put(2,s2);
	


		student s=(student) h.get(1);
//student s= h.get(2);  u r not doing downcasting so error ashowing = because it gives object in map also this is upcasted to object

		System.out.println("Student object is ="+s.name);  


		Set key=h.keySet();
		

		Iterator i1=key.iterator();

		while(i1.hasNext()==true)
		{
			System.out.println(h.get(i1.next()));  
		}

	}
}