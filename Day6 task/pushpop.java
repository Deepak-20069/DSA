package sdprograms;

public class pushpop {
	private int[] stack;
    private int top = -1;

    public pushpop(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
        if (top < stack.length - 1) stack[++top] = value;
    }

    public int pop() {
        return (top >= 0) ? stack[top--] : -1;
    }

    public int peek() {
        return (top >= 0) ? stack[top] : -1;
    }

    public static void main(String[] args) {
        pushpop s = new pushpop(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());  
        System.out.println(s.peek()); 
        s.push(40);
        System.out.println(s.peek()); 
    }
}
	
	    



