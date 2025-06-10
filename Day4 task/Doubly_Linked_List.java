package sdprograms;

public class Doubly_Linked_List {
	class Node {
        int data;
        Node next, prev;
        Node(int data)
        {
        	this.data = data; 
        }
    }

    private Node head;

    public void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null)
        head = newNode;
        else 
        {
            Node current = head;
            while (current.next != null) 
            current = current.next;
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void traverseForward()
    {
        for (Node current = head;
        current != null; 
        current = current.next)
        System.out.print(current.data + "  ");
        System.out.println("null");
    }

    public void traverseBackward() 
    {
        if (head == null)
        return;
        Node current = head;
        while (current.next != null) 
        current = current.next;
        for (; current != null; current = current.prev)
        System.out.print(current.data + "  ");
        System.out.println("null");
    }

    public boolean search(int value)
    {
        for (Node current = head;
        current != null;
        current = current.next)
        if (current.data == value)
        return true;
        return false;
    }

    public static void main(String[] args) 
    {
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.insert(10); 
        list.insert(60);
        list.insert(30); 
        list.insert(40);
        list.traverseForward();
        list.traverseBackward();
        System.out.println(list.search(20) ? "20 found" : "20 not found");
    }

}
