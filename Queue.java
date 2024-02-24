import java.util.NoSuchElementException;

public class Queue {

    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int count;

    public Queue(int size) {
        this.size = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isFull() {
        return count == size;
    }
    0
    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new NoSuchElementException("Queue is full.");
            return;
        }
        rear = (rear + 1) % size;
        queueArray[rear] = item;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        int item = queueArray[front];
        front = (front + 1) % size;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return queueArray[front];
    }


    public void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(8);

        System.out.println("First item: " + queue.peek());
        System.out.println("Removed item: " + queue.dequeue());
        System.out.println("New first item: " + queue.peek());
    }


}
