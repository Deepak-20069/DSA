package sdprograms;

import java.util.Scanner;

public class MenuDrivenCLL {
	

	    private Node head = null;
	    private Node tail = null;

	    private class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public void insert(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            tail.next = head;  // Circular link
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head;  // Circular link
	        }
	    }

	    public void delete() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head == tail) {
	            head = null;
	            tail = null;
	        } else {
	            head = head.next;
	            tail.next = head;
	        }
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MenuDrivenCLL cll = new MenuDrivenCLL();
	        int choice, value;

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    value = sc.nextInt();
	                    cll.insert(value);
	                    break;
	                case 2:
	                    cll.delete();
	                    break;
	                case 3:
	                    cll.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        }
	    }

}
