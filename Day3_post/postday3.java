package sdprograms;

import java.util.Scanner;

public class postday3{
	  static class Node {
	        int data;
	        Node next;
	        Node(int data) { this.data = data; this.next = null; }
	    }

	    private Node head;

	    public void insertAtBeginning(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) last = last.next;
	        last.next = newNode;
	    }

	    public void deleteFromBeginning() {
	        if (head != null) head = head.next;
	        else System.out.println("List is empty.");
	    }

	    public void deleteFromEnd() {
	        if (head == null) System.out.println("List is empty.");
	        else if (head.next == null) head = null;
	        else {
	            Node temp = head;
	            while (temp.next != null && temp.next.next != null) temp = temp.next;
	            temp.next = null;
	        }
	    }

	    public void traverse() {
	        if (head == null) System.out.println("List is empty.");
	        else {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + "  ");
	                temp = temp.next;
	            }
	           
	        }
	    }

	    public boolean search(int data) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.data == data) return true;
	            temp = temp.next;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        postday3 list = new postday3();

	        while (true) {
	            System.out.println("\nMenu:\n1. Insert at beginning\n2. Insert at end\n3. Delete from beginning\n4. Delete from end\n5. Traverse\n6. Search\n7. Exit");
	            System.out.print("Choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1: list.insertAtBeginning(scanner.nextInt()); break;
	                case 2: list.insertAtEnd(scanner.nextInt()); break;
	                case 3: list.deleteFromBeginning(); break;
	                case 4: list.deleteFromEnd(); break;
	                case 5: list.traverse(); break;
	                case 6: 
	                    System.out.println(list.search(scanner.nextInt()) ? "Found" : "Not Found");
	                    break;
	                case 7: scanner.close(); return;
	                default: System.out.println("Invalid choice.");
	            }
	        }
	    }

}
