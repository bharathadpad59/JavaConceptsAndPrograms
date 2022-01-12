package javaprograms.MyPractice;

public class Node {
	
	Long value;
	Node reference;
	
	
	public Node(Long value) {
		super();
		this.value = value;
		DataStructureLinkedListNodeTest ds= new DataStructureLinkedListNodeTest();
		DataStructureLinkedListNodeTest.i=10;
		
	}
	
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Node getReference() {
		return reference;
	}
	public void setReference(Node reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", reference=" + reference + "]";
	}
	
	

}
