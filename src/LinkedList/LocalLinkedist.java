package LinkedList;

public class LocalLinkedist<T> {
	private Node<T> head;

	public boolean isEmpty() {
		return (head==null);
		
	}
//	insertion of data at the beginning 
	public void insertFirst(T data) {
		Node<T> newHead=new Node<T>();
		newHead.data= data;
		newHead.next=head;
		head= newHead;
		display();
	}
	
	public  void display() {
		head.displayData();
	}
	
	
// method for deleting first element 
	public Node<T> deleteFirst() {
		Node<T> temp= head;
		head= head.next;
		return temp;
	}
	
	// method for inserting element at specific position
	public void insertAt(T data, int position) {
		
	}
}
