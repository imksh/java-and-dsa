package linkedList;

public class ReverseLL {
	ListNode reverse(ListNode head)
	{
	    ListNode prev=null;
	    ListNode current= head;
	    
	    while(current!=null)
	    {
	        ListNode next = current.next;
	        current.next=prev;
	        prev=current;
	        current=next;
	        
	        
	    }
	    return prev;
	}
}
	
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
