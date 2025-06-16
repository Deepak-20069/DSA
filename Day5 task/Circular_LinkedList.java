package sdprograms;

public class Circular_LinkedList {
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
	    public void insert(int data)
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
	        Circular_LinkedList list = new Circular_LinkedList();
	        list.insert(5);
	        list.insert(10);
	        list.insert(15);
	        list.insert(20);
	        list.display();
	    }
	}


	
	
