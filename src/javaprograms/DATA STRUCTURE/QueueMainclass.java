class QueueDS 
{
	private int [] Queue;
	private final int default_size=5;
	private int size=0;
	private int front=-1;
	private int back=-1;
	private IndexOutOfBoundsException ref=new IndexOutOfBoundsException();


public QueueDS()
{
	Queue=new int[default_size];
}
public void enQueue(int value)
{
	if(size<5)
	{
		Queue[++back]=value;
		size++;
		System.out.println(value+" is added to Queue");
	}
	else
	{
		throw ref;
	}
	if (size==1) 
	{
		front++;
	}

}

public int deQueue()
{

	if(size!=0)
	{
		size--;
		return Queue[front++];
	}
	else
	{
		throw ref;
	}
}
public int size()
{
	return size;
}
@Override
public String toString()
{
	String elems=" ";
	for (int i=front;i<=back;i++) 
	{
		elems=elems+" "+Queue[i];
	}
	return elems;
}

}

class QueueMainclass
{
	public static void main(String[] args) 
	{
		QueueDS s1=new QueueDS();
		System.out.println("size="+s1.size());
		s1.enQueue(10);
		s1.enQueue(20);
		s1.enQueue(30);
		s1.enQueue(40);
		s1.enQueue(50);
		System.out.println(s1);
		

		System.out.println("size new="+s1.size());

		while(s1.size()!=0)   //u can use top!=-1 ,but we should create itsmethod as like size and then freely use it.
		{
			System.out.println(s1.deQueue());
		}
			
		System.out.println("size="+s1.size());
	}
}