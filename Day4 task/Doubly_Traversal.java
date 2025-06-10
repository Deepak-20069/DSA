package sdprograms;

public class Doubly_Traversal
{
	class Node 
	{
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
    private Node tail;
    public void insert(int data)
    {
        Node newNode = new Node(data);        
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void traverseFront()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void traverseBack() 
    {
        Node temp = tail;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Doubly_Traversal list = new Doubly_Traversal();       
        list.insert(10); 
        list.insert(20); 
        list.insert(30); 
        list.insert(40);       
        System.out.print("Front Traversal: ");
        list.traverseFront();
        System.out.print("Back Traversal: ");
        list.traverseBack(); 
    }

}
