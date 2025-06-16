package sdprograms;

public class Circular_Delete 
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
    void deleteFromHead()
    {
        if (head == null)
            return;
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
        Circular_Delete cll = new Circular_Delete();
        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.display();
        cll.deleteFromHead();
        cll.display();
    }

}
