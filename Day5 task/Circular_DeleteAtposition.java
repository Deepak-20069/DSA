package sdprograms;

public class Circular_DeleteAtposition
{
	 Node head = null;
	 Node tail = null;
	    class Node
        {
	        int data;
	        Node next;
	        Node(int data) 
	        {
	            this.data = data;
	        }
	    }
	    void add(int data) 
	    {
	        Node newNode = new Node(data);
	        if (head == null) 
	        {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;
	        }
	        else
	        {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head;
	        }
	    }
	    void deleteAtPosition(int position) 
	    {
	        if (head == null || position <= 0)
	            return;
	        if (position == 1) 
	        {
	            if (head == tail)
	            {
	                head = null;
	                tail = null;
	            } 
	            else 
	            {
	                head = head.next;
	                tail.next = head;
	            }
	            return;
	        }
	        Node temp = head;
	        int count = 1;
	        while (count < position - 1 && temp.next != head) 
	        {
	            temp = temp.next;
	            count++;
	        }
	        if (temp.next == head || temp.next == null)
	            return;
	        if (temp.next == tail)
	            tail = temp;
	        temp.next = temp.next.next;
	    }
	    void display() 
	    {
	        if (head == null)
	            return;
	        Node temp = head;
	        do 
	        {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        while (temp != head);
	        System.out.println();
	    }
	    public static void main(String[] args) 
	    {
	        Circular_DeleteAtposition cll = new Circular_DeleteAtposition();
	        cll.add(10);
	        cll.add(20);
	        cll.add(30);
	        cll.add(40);
	        cll.add(50);
	        cll.display();
	        cll.deleteAtPosition(1); 
	        cll.display();
	        cll.deleteAtPosition(3); 
	        cll.display();
	        cll.deleteAtPosition(3); 
	        cll.display();
	    }

}
