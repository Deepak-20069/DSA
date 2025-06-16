package sdprograms;

import java.util.Scanner;

public class Stack {
	private int[] stack;
    private int top = -1;

    public Stack(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
        if (top < stack.length - 1) stack[++top] = value;
        else System.out.println("Stack Overflow");
    }

    public void pop() {
        if (top >= 0) System.out.println("Popped " + stack[top--]);
        else System.out.println("Stack Underflow");
    }

    public void peek() {
        if (top >= 0) System.out.println("Top element is " + stack[top]);
        else System.out.println("Stack is empty");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(5);
        int choice;

        while (true) {
            System.out.println("\n1. Push 2. Pop 3. Peek 4. Exit");
            choice = sc.nextInt();
            if (choice == 1) { System.out.print("Enter value: "); 
            s.push(sc.nextInt()); }
            else if (choice == 2) 
            	s.pop();
            else if (choice == 3) 
            	s.peek();
            else if (choice == 4) 
            	break;
            else System.out.println("Invalid choice");
        }
        sc.close();
    }

}
