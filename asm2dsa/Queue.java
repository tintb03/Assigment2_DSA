package ASMlan4;

public class Queue {
    private static final int MAX_QUEUE_SIZE = 4;

    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        this.queue = new String[MAX_QUEUE_SIZE];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(String message) {
        if (!isFull()) {
            queue[rear] = message;
            rear = (rear + 1) % MAX_QUEUE_SIZE;
            size++;
        }
    }

    public String dequeue() {
        String message = null;
        if (!isEmpty()) {
            message = queue[front];
            front = (front + 1) % MAX_QUEUE_SIZE;
            size--;
        }
        return message;
    }

    public boolean isFull() {
        return size == MAX_QUEUE_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayQueue() {
        System.out.print("Các giá trị trong Queue hiện tại: ");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index]);
            if (i < size - 1) {
                System.out.print("; ");
            }
            index = (index + 1) % MAX_QUEUE_SIZE;
        }
        System.out.println();
    }
}



