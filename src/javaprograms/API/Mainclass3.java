package javaprograms.API;

import java.util.HashSet;
import java.util.Set;

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
	public  int hashCode()	//we use object class methods to override mostly because every developers know these methods its easy for them 
		 					//to identify methods, as userdefined methods will be hard for them to understand and read the functionality
	{						// thats why its a good practise to use object class methods.
		return id;
	}

	@Override                                  // perfect example of method overriding //overriding into subclass from superclass
	public boolean equals(Object obj)
	{
		return this.hashCode()==obj.hashCode(); // we are eliminating downcasting by using hash code values because they will have diff ids
//	student s=(student)obj;
//		return this.hashCode()==s.hashCode();   //false only this will give but we can easily get our class variable here to compare so we downcast

//		student s=(student)obj;
//		return this.marks==s.marks; 
		 
	}// USING UPCASTED REF IF WE CALL AN OVEERIDEN METHOD THEN WE WILL ALWAYS GET IMPLEMENTATION OF OVERRIDEN METHOD
	// S2=OBJECT OBJ  s1==s1// (S2)OBJ.hashcode()==this.hashcode
	@Override
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}

class Mainclass3
{
	public static void main(String[] args) 
	{
		student s1=new student("bharat",7,77);
		student s2=new student("bharat",8,79);
		student s3=new student("bharat",8,77);
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);

		boolean b1=s1.equals(s2);
		boolean b2=s2.equals(s3);

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		
		Set<student> stud= new HashSet<>();
		stud.add(new student("bharat",7,77));
		stud.add(new student("bharat",8,79));
		stud.add(new student("bharat",8,77));
		
		System.out.println("set will not work withoush hashcode=="+stud);
	}
}