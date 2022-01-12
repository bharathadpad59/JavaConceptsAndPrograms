class TestingApi extends Exception
{

}



class BharatTesting
{
	public void testingException(int num) throws TestingApi
	{
		int a=50;

		
		if (num==0) { 
			TestingApi ta= new TestingApi();
			throw ta;
		}
		int result =a/num;
		System.out.println("Result is ="+result);
	}
}


class Mainclass6
{
	public static void main(String[] args) throws TestingApi {

		BharatTesting b= new BharatTesting();
		//Exception propogation i.e jvm willm pass the exception object from called method back to calling method and this
		// is checked Exception i.e custom excceptions are also checked exceptions because we have to catch externally and 
		//that to RUN time
		//if checked exception is thetre than jvm will check that exceptions at compile time 
		b.testingException(0);
		// try{
		// 	b.testingException(0);
			
		// }
		// catch(Exception e){
		// 	e.printStackTrace();
		// }
		
	}

}