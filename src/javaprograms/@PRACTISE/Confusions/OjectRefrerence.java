class Bharat  {
	
	private String name;

	private int rollno;


	public String getName(){
		return "Bharat";
	}
	public void setName(String name){
		 this.name=name;
	}

	public int getRollno(){
		return 1;
	}
	public void setRollno(int rollno){
		 this.rollno=rollno;
	}

}

class OjectRefrerence{


public static void main(String[] args) {
	Bharat bharat = new Bharat();
	
		int a= bharat.getRollno();
		String b= bharat.getName();

		System.out.println("Values are ="+ a +","+ b);
}

}