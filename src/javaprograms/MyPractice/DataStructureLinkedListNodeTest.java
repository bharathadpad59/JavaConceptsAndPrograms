package javaprograms.MyPractice;

public class DataStructureLinkedListNodeTest {
	
	Node head=null;
	Node tail=null;
	int bucketSize=0;
	static int i=0;

	public static void main(String[] args) {
		
		DataStructureLinkedListNodeTest ds= new DataStructureLinkedListNodeTest();
		ds.add(10L);
		ds.add(20L);
		ds.add(30L);
		ds.add(40L);
		ds.add(50L);
		
		
		
		System.out.println("i++"+(++i));
		System.out.println("head=="+ds.head);
		System.out.println("tail=="+ds.tail);
		
		System.out.println("Get Position 3rd value=="+ds.get(3L));

	}
	
	public  void add(Long addData) {
		Node n1= new Node(addData);
		if(head==null) {
			head=n1;
			tail=n1;
			tail.setReference(null);
		}
		
		tail.setReference(n1);
		tail=n1;
	}
	
	public Node get(Long bucketNo) {
		Node nd;
		if(bucketNo==0L) {
		return head;
		}
		
		nd=head.getReference();
		int i=1;
		while(i<bucketNo) {
			
			nd=nd.getReference();
			i++;
		}
		return nd;
		
	}

}
