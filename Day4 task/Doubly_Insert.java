package sdprograms;

public class Doubly_Insert 
{
	 class Node {
	        int data;
	        Node next;
	        Node prev;
            Node(int data)
            {
	            this.data = data;
	            next = prev = null;
	        }
	    }

	    private Node head;

	    public void insert(int data)
	    {
	        Node newNode = new Node(data);
	        
	        if (head == null) 
	        {
	            head = newNode;
	            return;
	        }

	        Node slow = head;
	        Node fast = head;
	        
	        while (fast != null && fast.next != null)
	        {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        newNode.prev = slow.prev;
	        newNode.next = slow;
	        if (slow.prev != null) 
	        {
	            slow.prev.next = newNode;
	        }
	        slow.prev = newNode;
	        
	        if (newNode.prev == null) 
	        {
	            head = newNode;
	        }
	    }

	    public void printList() 
	    {
	        Node temp = head;
	        while (temp != null) 
	        {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args)
	    {
	        Doubly_Insert list = new Doubly_Insert();
            list.insert(10); 
            list.printList();
	        list.insert(20);
	        list.printList();
	        list.insert(30);
	        list.printList();
	        list.insert(40); 
	        list.printList();
	    }
}
