class Bharat
{
	 String name;
	 String school;
	 int id;

	 public Bharat(String name,String school,int id)
	 {
	 	this.name=name;
	 	this.school=school;
	 	this.id=id;
	 }

	 public void showdetails()
	 {
	 	System.out.println("Name="+name+" "+"school="+school+" "+"id="+id );
	 }

}
class Arrayobjectexample
{
	

public static void main(String[] args) {
	Bharat[] ref=new Bharat[10];

	ref[0]= new Bharat("Bharat","Tapovan",1);


	ref[0].showdetails();
	
}

}