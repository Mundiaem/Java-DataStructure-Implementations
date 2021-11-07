package LinkedList;

public class SinglelyLinkedList {
public  static void main(String [] agrs) {
	
	LocalLinkedist<String> linkedList= new LocalLinkedist<String>();
	linkedList.insertFirst("Developer");
	linkedList.insertFirst("Software Engineer");
	linkedList.insertFirst("Data ");
	linkedList.insertFirst("Electronics");
	linkedList.insertFirst("Software");
	linkedList.insertFirst("AI");
	linkedList.insertFirst("IOT");
	linkedList.insertFirst("C++");

	System.out.print(linkedList.isEmpty());
}


}
