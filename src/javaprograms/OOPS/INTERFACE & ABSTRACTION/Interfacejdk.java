interface Run1
{
						// from jdk 1.8 onwards enhancement in interface comes that we can use concrete methods
	public void display()
	{
		System.out.println("Display() of Run1");
	}						// and that concrete methods should be declared as static,default.
}							// if we want to implements 2 interafaces which contains default constructors with 
							// same names and same arguments then we must and should override and callls it  by
							// by taking interacename.super.method()
interface Run2
{
	
	public void display()
	{
		System.out.println("Display() of Run2 ");
	}
}



class sample implements Run1,Run2
{
	@Override
	public void display()
	{
		System.out.println("Printing display()");

		Run1.super.display();
		Run2.super.display();
	}
}

class Interfacejdk
{
	public static void main(String[] args) 
	{
		sample s1=new sample();
		s1.display();
		
	}
}
