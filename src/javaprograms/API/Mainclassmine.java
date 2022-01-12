package javaprograms.API;

class  student
{
	String name;
	int id;
	double marks;


	public student(String a,int b,double c)
	{
		name=a;
		id=b;
		marks=c;
	}

	public student(String a)
	{
		name=a;
		
	}
	
// here u r compairing always hashcodes values of 2 objects so it will alwys give false because hashcodes values will alwys be  different
// so we should do somethng that with the hashcodes method values we must compare 2 i/p values whether it is same or diff and that is possible 
// because of method overriding(hashcode,equals) Mainclass2.jav program.

	@Override
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}

class Mainclassmine
{
	public static void main(String[] args) 
	{
		student s1=new student("bharat",7,77);
		student s2=new student("bharat",7,77);
		student s3=new student("bharat");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		int h1=s1.hashCode();
		int h2=s2.hashCode();
		int h3=s3.hashCode();
		System.out.println("h1="+h1);
		System.out.println("h2="+h2);
		System.out.println("h3="+h3);
										
		boolean b1=s1.equals(s2);

		System.out.println("b1="+b1);
	}
}