class Node
{
	int data;
	Node nxt;

public Node(int data)
{
	this.data=data;
}

@Override
public String toString()
{
	return data+" ";
}
}

class Linkedist
{
	Node head=null;
	Node tail=null;
	int size=0;

	public void add(int data)
	{
		Node nd=new Node(data);  // whenever a new object of node is created size++;is occuring
								// whenever a node new object is created it contains data,as well as ref var which contains address of nxt 
		size++;					// node.
			if (head==null) 
		{
			head=nd;
			tail=nd;
			tail.nxt=null;
			return;
		}
			tail.nxt=nd;
			tail=nd;

	}

	public int get(int pos)
	{
			if (pos==0) 
		{
			return head.data;
		}
			Node temp=head.nxt;

			int i=1;

			while (i<pos) 
			{
				temp=temp.nxt;   //head.nxt.nxt
				i++;
			}
			return temp.data;
	}

	public  int size()
	{
		return size;
	}

}

class MainclassLinkedList
{
	public static void main(String[] args) 
	{
		Linkedist l1=new Linkedist();

		System.out.println("size="+l1.size());
		
		l1.add(20);
		l1.add(30);
			
		System.out.println("size="+l1.size());
		l1.add(40);
		l1.add(50);

		System.out.println("size="+l1.size());

		System.out.println(l1.get(3));
		System.out.println(l1.get(1));

	}
}