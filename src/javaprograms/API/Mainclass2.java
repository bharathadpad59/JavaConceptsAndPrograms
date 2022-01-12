package javaprograms.API;

class Mainclass2 
{
	public static void main(String[] args) 
	{
		String s1=new String("Hello");
		String s2=new String ("bharat");
		String s3=new String("bharat");
		String s4="bharat";

		Object obj1=s1;  //upcasting
		Object obj2=s2;
		Object obj3=s3;  //upcasting
		Object obj4=s4;

		int h1=s1.hashCode();
		int h2=s2.hashCode();
		int h3=s3.hashCode();
		int h4=s4.hashCode();


		System.out.println("HASHCODE");
		System.out.println("h1="+h1);
		System.out.println("h2="+h2);
		System.out.println("h3="+h3);
		System.out.println("h4="+h4);

		System.out.println("TOSTRING");
		System.out.println("s1="+s1);
		System.out.println("PRINTING UPCASTED REF.");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

		boolean b1=s1.equals(s2);
		System.out.println("b1="+b1);

		System.out.println("downcasting");
		String s5=(String)obj1;
		String s6=(String)obj2;




		// int res=s1.compareTo(s2);
		// //int rescompare=s1.compare(s2);
		// int resnew=s3.compareTo(s4);
		// /*int res=obj1.compareTo(obj2);*/ not possible because String  class implements <<Comparable>> interface not object class so we
		// 									have to downcasting first then u can comapare 
		// System.out.println(res);
		// // System.out.println(resnew);

	}
}