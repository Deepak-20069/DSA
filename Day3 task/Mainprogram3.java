package sdprograms;

public class Mainprogram3 {
	 class Node {
        int data;
        Node next;
        Node(int data) { 
        	this.data = data; 
        }
    }

    Node head;

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }


    public void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;        
            current = next;
        }
        head = prev;  
    }

    
    public void printList() {
        for (Node current = head; current != null; current = current.next) 
            System.out.println(current.data + "  ");
      
    }

    public static void main(String[] args) {
       Mainprogram3 list = new Mainprogram3();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("Original List:");
        list.printList(); 
      
        list.reverse();
        System.out.println("Reversed List:");
        list.printList(); 
    }
	

}
