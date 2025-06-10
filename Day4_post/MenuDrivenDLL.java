package sdprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuDrivenDLL 
{
	class Node 
	{
        int data;
        Node next, prev;
        Node(int data) 
        { 
        	this.data = data; 
        }
    }
    private Node head;
    public void insertAtBeginning(int data) 
    {
        Node newNode = new Node(data);
        if (head != null) 
        {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int data) 
    {
        Node newNode = new Node(data);
        if (head == null)
        head = newNode;
        else 
        {
            Node temp = head;
            while (temp.next != null)
            temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void deleteNode(int data) 
    {
        Node temp = head;
        while (temp != null && temp.data != data) 
        temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null)
        temp.prev.next = temp.next;
        if (temp.next != null)
        temp.next.prev = temp.prev;
        if (temp == head)
        head = temp.next;
    }

    public void displayList() 
    {
        Node temp = head;
        while (temp != null)
        {
        	System.out.print(temp.data + " <-> ");
        	temp = temp.next; 
        }
        System.out.println("NULL");
    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuDrivenDLL list = new MenuDrivenDLL();
        int choice;
        int data;
        while (true) 
        {
            System.out.println("1. Insert at beginning\n2. Insert at end\n3. Delete\n4. Display\n5. Exit");
            choice = Integer.parseInt(reader.readLine());
            if (choice == 1) 
            {
                System.out.print("Enter data: ");
                data = Integer.parseInt(reader.readLine());
                list.insertAtBeginning(data);
            }
            else if (choice == 2) 
            {
                System.out.print("Enter data: "); 
                data = Integer.parseInt(reader.readLine()); 
                list.insertAtEnd(data);
            }
            else if (choice == 3)
            {
                System.out.print("Enter data to delete: "); 
                data = Integer.parseInt(reader.readLine());
                list.deleteNode(data);
            }
            else if (choice == 4) 
            {
            list.displayList();
            }
            else if (choice == 5) 
            {
            break;
            }
        }
    }
}
