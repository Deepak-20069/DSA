package sdprograms;

public class Queue {
	private int[] queue;
    private int front = -1, rear = -1;

    public Queue(int capacity) {
        queue = new int[capacity];
    }

    public void enqueue(int value) {
        if (rear < queue.length - 1) queue[++rear] = value;
        else System.out.println("Queue Overflow");
    }

    public void dequeue() {
        if (front == rear) System.out.println("Queue Underflow");
        else System.out.println("Dequeued " + queue[++front]);
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.enqueue(30);
        q.dequeue();
    }

}
