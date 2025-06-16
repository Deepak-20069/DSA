package sdprograms;

public class Frontrear {
	private int[] queue;
    private int front, rear, size, capacity;

    public Frontrear(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println("Enqueued " + value);
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Dequeued " + queue[front]);
            front = (front + 1) % capacity;
            size--;
        }
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
