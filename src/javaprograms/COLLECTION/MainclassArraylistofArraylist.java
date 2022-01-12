import java.util.ArrayList;
import java.util.Iterator;
class student
{
	String name;
	int id;
	double marks;


	public student(String a,int b,double c) // itertor implicitly calls tostring() whileprinting
	{
		name=a;
		id=b;
		marks=c;
	}

	public int getid()
	{
		return id;
	}

	@Override 
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}

class MainclassArraylistofArraylist
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<student>> alist=new ArrayList<ArrayList<student>>();
		
		ArrayList list1=new ArrayList();
		list1.add(new student("Dhoni",7,77));
		list1.add(new student("Virat",11,78));

		ArrayList list2=new ArrayList();
		list2.add(new student("Sachin",10,99));
		list2.add(new student("Rohit",15,111));

		alist.add(list1);
		alist.add(list2);

System.out.println(alist.get(0));
//System.out.println(alist.get(1).get(0).getid()); // when u do get(0) =Object obj1 = Sachin,,,, so obj1.getid(); (BECAUSE OF GENERICS)
System.out.println(alist.get(1).get(0));

//student ref=alist.get(1).get(0);  // working because using generics used here thats why it gives object
student ref=(student)alist.get(1).get(0);
System.out.println("Upcasted Object printing ="+ref.getid());  
// because u are mentioning generics thats why its giving value (student ref=alist.get(1).get(0);  after ref1.getid()) or else
// u have to downcast 1st then use the methods of object class
ArrayList<student> s1=alist.get(0);
	
	student s=(student)s1.get(0);

	System.out.println(s.getid());





		//student  s=(student)alist.get(0);
		//System.out.println(s.getid());



		
	
		
	}
}
