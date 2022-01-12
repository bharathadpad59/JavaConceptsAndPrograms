package javaprograms.API;

class Mainclass
{
	public static void main(String[] args) {
		System.out.println("Program Starts...........");

		Object obj1=new Object();
		Object obj2=new Object();

		int h1=obj1.hashCode();    // calling hashcode method and storing the value in int var.
		int h2=obj2.hashCode();

		System.out.println("h1="+h1); //printing hashcode values for each object
		System.out.println("h2="+h2);

		String str=obj1.toString();  // to string method call which will return string representation of object

		System.out.println("str="+str);

		System.out.println("obj1="+obj1); // printing object class var will call toString method implicitly  return string
											//  representation of object 
		System.out.println("obj2"+obj2);	

		boolean b1=obj1.equals(obj2);
		System.out.println("b1="+b1);
	}
}