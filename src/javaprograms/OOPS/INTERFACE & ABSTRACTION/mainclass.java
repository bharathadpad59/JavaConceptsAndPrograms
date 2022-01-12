interface program
{
	public void makepayment();
}

class debitcard implements program
{
	@Override
	public void makepayment()
	{
		System.out.println("This is the debit card calculation for makepayment");
	}
}

class creditcard implements program
{
	@Override
	public void makepayment()
	{
		System.out.println("This is the credit card calculation for makepayment");
	}
}
class swipemachine
{
	public static void swipecard(program ref) 
	{
		ref.makepayment();
	}
}

class mainclass
{
	public static void main(String[] args) {
		debitcard ref1=new debitcard();
		swipemachine.swipecard(ref1);		
											// this is polymorphism,i.e code flexibility is done by upcasting object class with interface 
		creditcard ref3=new creditcard();	// refvar so,if we call the upcasted refvar. of interace, we will always get overriden
		swipemachine.swipecard(ref3);		// implmtn of the method.



		creditcard ref4=new creditcard();
	    ref4.makepayment();


		program refr=new creditcard();
	    refr.makepayment();
	}

}