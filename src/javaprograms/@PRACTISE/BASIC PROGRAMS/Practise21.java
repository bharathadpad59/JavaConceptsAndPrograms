interface Common
{
	public void test(int num);
}


class bharat implements Common
{
	public void test(int num){

		int a=100;
		int res=a/num;
		System.out.println("Hello this is bharat class"+res);

	}
}

class basavraj implements Common
{
	public void test(int num){

		int a=100;
		int res=a+num;
		System.out.println("Hello this is bharat class"+res);

	}
}


class bro implements Common
{
	public void test(int num){

		int a=100;
		int res=a%num;
		System.out.println("Hello this is bharat class"+res);

	}
}



class Practise21
{
	public static void main(String[] args){
		
		Common b = new bharat();

		b.test(5);

		for (int i=0;i<4;i++ ) {
			for (int j=0;j<4;j++) {

				if(j>=i && j<=8-i)
				{
					System.out.print(" *");

				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println(" ");

			
		}
	
	}
}
