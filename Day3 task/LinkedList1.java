package sdprograms;

public class LinkedList1 {
	static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    Node head; 
    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null) return; 
        newNode.next = current.next;
        current.next = newNode;
    }
    public void printList() {
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + "  ");
        }
        
    }

}
