package sdprograms;

public class SDA {
	private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SDA() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed " + value);
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped " + top.data);
            top = top.next;
        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is " + top.data);
        }
    }

    public static void main(String[] args) {
    	SDA stack = new SDA();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.peek();
    }

}
