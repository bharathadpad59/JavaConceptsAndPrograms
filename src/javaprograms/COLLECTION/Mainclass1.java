import java.util.ArrayList;  // In Collection u dont have to fix size u can add no of values and easily get it
class shoes				// not like array u have to fix as a[10] then add 10 elemnts jvm will add automatically in collection Arraylist
{
	int size;
	String colour;
	String brand;
	double price;

	public shoes(int size,String colour,String brand,double price)
	{
		this.size=size;
		this.colour=colour;
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString()  // i know toString() method of String class gives (new object values) of array, when we call 
							 // without any custome made defination.
	{					     // but if u writing custom output(Defination) of tosString() then whenever u will call it will give 
											// custom made o/p.
		return brand+" "+size+" "+colour;
	}

}
class Mobile
{
	int model;
	String colour;
	String brand;
	double price;
	int ram;

	public Mobile(int model,String colour,String brand,double price,int ram)
	{
		this.model=model;
		this.colour=colour;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
	}

	@Override
	public String toString()
	{
		return brand+" "+model+" "+colour+" "+price+" "+ram;
	} 


}

class  Mainclass1
{

	public static void showCart(ArrayList cart) 
	{
		for (int i=0;i<cart.size();i++) 
		{
			System.out.println(cart.get(i)); //printing upcasted reference
		}
	}
	public static void main(String[] args)
	{
	shoes s1=new shoes(10,"White","Puma",2999.0);// ArrayList allows Duplicates,index,null values,preserve insertion order
	Mobile m1=new Mobile(1234,"Black","Apple",29878.8,4);
	shoes s2=new shoes(10,"White","Puma",2999.0);
	Mobile m2=new Mobile(1234,"Black","Apple",29878.8,4);

	ArrayList cart =new ArrayList();
	cart.add(s1);
	cart.add(m1);
	cart.add(s2);
	cart.add(m2);


	//shoes s=cart.get(0);    // this is not possible because everything is upcasted in collection while adding the value or object
	shoes s=(shoes)cart.get(0);      // so u have tro downcast to use ur own class Valuezs
									// here storing upcated reference
	System.out.println("shoes object="+cart.get(0));  //this is [possible] becauz using upcasted ref if we call an overriden method means it will always 
	System.out.println("shoes object="+s);			// give u the implementation of overriudeen method
	// here we r storing then printing
	showCart(cart);
	System.out.println(cart.size()); //to check the size
	}
}
