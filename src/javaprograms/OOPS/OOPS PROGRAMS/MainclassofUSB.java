class mouse
{
	public static void click() 
	{
		System.out.println("This is Mouse Connected");
		System.out.println("                          ");
		System.out.println("Click & select");
	}

	public static void scroll() 
	{
		System.out.println("Scroll up down");
	}
}

class mobile
{
	public static void charge() 
	{
		System.out.println("This is Mobile Connected");
		System.out.println("                          ");
		System.out.println("only charge");
	}

	public static void filetransfer() 
	{
		System.out.println("filetransfer and charge");
	}
}

class pendrive
{
	public static void read() 
	{
		System.out.println("This is Pendrive Connected");
		System.out.println("                          ");
		System.out.println("acces files only");
	}

	public static void write() 
	{
		System.out.println("copy paste delete");
	}
}

class usbport
{
	public static void usbconnect(Object obj) 
	{
		if (obj instanceof mouse) 
		{
			mouse m2=(mouse)obj;

			m2.click();
			m2.scroll();
			System.out.println("-------------------");
		}
		else if (obj instanceof pendrive) 
		{
			pendrive p2=(pendrive)obj;
			p2.read();
			p2.write();
			System.out.println("------------------------");
		}

		else{
			mobile mb2=(mobile)obj;
			mb2.charge();
			mb2.filetransfer();
		}
	}
}

class MainclassofUSB
{
	public static void main(String[] args) 
	{
	mouse m1=new mouse();
	usbport.usbconnect(m1);

	pendrive p1=new pendrive();
	usbport.usbconnect(p1);

	mobile mb1=new mobile();
	usbport.usbconnect(mb1);
	}
}











