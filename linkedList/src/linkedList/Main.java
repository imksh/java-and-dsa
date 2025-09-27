package linkedList;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Single Linked List");
		LL list = new LL();
		list.addFirst(3);
		list.addFirst(5);
		list.addFirst(2);
		list.addFirst(4);
		list.addFirst(1);
		list.display();
		list.addLast(20);
		list.display();
		list.addAtIndex(25, 3);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.deleteAtIndex(2);
		list.display();
		list.reverse();
		list.display();
		System.out.println(list.findValue(2));
		System.out.println(list.findNode(5));
		System.out.println();
		
		System.out.println("Doubly Linked List");
		
		DLL list2 = new DLL();
		list2.addFirst(3);
		list2.addFirst(5);
		list2.addFirst(2);
		list2.addFirst(4);
		list2.addFirst(1);
		list2.display();
		list2.displayRev();
		list2.deleteFirst();
		list2.display();
		list2.displayRev();
		list2.deleteLast();
		list2.display();
		list2.displayRev();
		list2.deleteAtIndex(2);
		list2.display();
		list2.displayRev();
		System.out.println();
		
		System.out.println("Circular Linked List");
		CircularLL list3 = new CircularLL();
		list3.addFirst(3);
		list3.addFirst(5);
		list3.addFirst(2);
		list3.addFirst(4);
		list3.addFirst(1);
		list3.display();
		list3.addLast(8);
		list3.display();
		list3.addAtIndex(18,3);
		list3.display();
		list3.deleteFirst();
		list3.display();
		list3.deleteLast();
		list3.display();

	}

}
