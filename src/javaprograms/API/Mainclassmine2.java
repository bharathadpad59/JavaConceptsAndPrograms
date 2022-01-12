package javaprograms.API;

class student
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



	@Override
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}

class Mainclassmine2
{
	public static void main(String[] args) 
	{
		student s1=new student("bharat",7,77);
		student s2=new student("bharat",8,77);
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		boolean b1=s1.equals(s2);
		System.out.println("b1="+b1);
	}
}