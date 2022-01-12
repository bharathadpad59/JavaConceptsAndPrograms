
import java.util.TreeSet;
import java.util.Iterator;

class player implements Comparable
{
	int rank;
	String name;
	String country;
	int ratings;

public player(String name,String country,int ratings)
{
	this.name=name;
	this.country=country;
	this.ratings=ratings;
}
@Override
public int hashCode()
{
	return ratings;
}

@Override
public int compareTo(Object obj) // we fix one value and compare with it and make tree
{
	return obj.hashCode()-this.hashCode();  // NATURAL SORTING

	/*
	return this.hashCode()-obj.hashCode(); this will give assending order
	*/
}

@Override
public String toString()
{
	return rank+" "+name+" "+country+" "+ratings;
}



}

class Mainclass7
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTS............................................");

		TreeSet t1=new TreeSet();

		t1.add(new player("Kane williamson","NZ",913));
		t1.add(new player("V Kohli","IND",922));
		t1.add(new player("David Warner","AUS",857));
		t1.add(new player("Stokes","ENG",778));
		t1.add(new player("C Pujara","IND",881));
		t1.add(new player("Sto","ENG",758));
		t1.add(new player("new Pujara","IND",889));
		
		Iterator i1=t1.iterator();
		int i=1;
		while (i1.hasNext()==true) 
		{	player plr=(player)i1.next();
			plr.rank=i;
			System.out.println(plr);
			//System.out.println("hello");
			i++;

			/*while (i1.hasNext()==true)
			{ 
				System.out.println(i1.next());
			}*/
		}
	}
}