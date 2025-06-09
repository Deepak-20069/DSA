package sdprograms;

public class LinkedList2 {
	static class Node {
        int data;
        Node next;
        Node(int data) { 
        	this.data = data; 
        	}
    }

    Node head;

    
    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position == 0) 
        {
        	newNode.next = head; head = newNode;
        	return; 
        	}
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) 
        	current = current.next;
        if (current != null)
        { 
        	newNode.next = current.next; current.next = newNode; 
        	}
    }

   
    public void deleteAtBegin() {
        if (head != null) head = head.next;
        else System.out.println("List is empty.");
    }

    
    public void deleteAtPosition(int position) {
        if (head == null) return;
        if (position == 0) {
        	head = head.next; return; 
        	}
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++)
        	current = current.next;
        if (current != null && current.next != null)
        	current.next = current.next.next;
    }

    public void printList() {
        for (Node current = head; current != null; 
        		current = current.next) 
            System.out.println(current.data + "  ");
        
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(1, 15);
        System.out.println("List after insertions:");
        list.printList();

        list.deleteAtBegin();
        System.out.println("List after delete at the beginning:");
        list.printList();

        list.insertAtPosition(1, 25);
        System.out.println("List after inserting 25 at position 1:");
        list.printList();

        list.deleteAtPosition(1);
        System.out.println("List after delete at position 1:");
        list.printList();
    }

}
