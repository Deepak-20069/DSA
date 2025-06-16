package sdprograms;

public class Circular_Insert 
{
	class Node 
	{
	    int data;
	    Node next;
	    Node(int data) 
	    {
	        this.data = data;
	        this.next = null;
	    }
	}	
	    Node head = null;
	    Node tail = null;
	    public void insertAtTail(int data) 
	    {
	        Node newNode = new Node(data);
	        if (head == null) {
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
	    public void display()
	    {
	        if (head == null) 
	        {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = head;
	        System.out.println("Circular Linked List: ");
	        do
	        {
	            System.out.println(current.data + " ");
	            current = current.next;
	        }
	        while (current != head);
	        System.out.println();
	    }
	    public static void main(String[] args) 
	    {
	        Circular_Insert list = new Circular_Insert();
	        list.insertAtTail(1);
	        list.insertAtTail(2);
	        list.insertAtTail(3);
	        list.insertAtTail(4);
	        list.display();
	    }
	}



