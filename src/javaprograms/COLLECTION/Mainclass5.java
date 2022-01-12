import java.util.HashSet;
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

	@Override
	public int hashCode()  // equals() compars hashcodes so it is required
	{
		return id;
	}

	/*
	@Override// all ref var are upcasted when it is added,so upcasted ref are stored in (OBJECT obj) and comapares with (this.hashCode) means other upcasted references i.e (Object obj),
			// so its easy for us to compares hashcode no downcasting needed, u can do by downcasting also. 
	public boolean equals(Object obj)
	{
		return this.hashCode()==obj.hashCode(); 
	}
	*/  // IMPROVED VERSIONs

	
	@Override
	public boolean equals(Object obj)
	{	student std=(student)obj;
		return this.hashCode()==std.hashCode(); 
	} 


	@Override 
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}

class Mainclass5
{
	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		hs1.add(new student("Dhoni",7,77));// dhoni will check in hashset is it is present no so added,
											// now bharat will go in obj and compare its hashcode with other hashcodes in hashset table if it is presnt 
										// no so it is added, no rohit will go toobj and checks with all if duplicate is there ? no so added to hashset
										// now rohit again goes to obj and checks its hashcode with other hashcodes is it matching ? yes so not added
		hs1.add(new student("bharat",8,77));
		hs1.add(new student("Ro-Hit Man",9,77));
		hs1.add(new student("Ro-Hit Man",9,77));

		/*
		Iterator i1=hs1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next()); // i1 is ref variable so it will call tostring() internally and prints values.
		}
		*/  // IMPROVED VERSION

		
		Iterator i1=hs1.iterator();
		while(i1.hasNext()==true)
		{
			student stdd=(student)i1.next();
			System.out.println(stdd);
		}
		
	
		
	}
}
