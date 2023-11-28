package asm2dsa;
public class Queue {
    private static final int MAX_SIZE = 10;  // Đặt giới hạn kích thước của hàng đợi
    private String[] messages;
    private int front, rear, size;
    public Queue() {
        this.messages = new String[MAX_SIZE];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public void enqueue(String message) {
        if (!isFull()) {
            rear = (rear + 1) % MAX_SIZE;
            messages[rear] = message;
            size++;
        }
    }
    public String dequeue() {
        if (!isEmpty()) {
            String message = messages[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            return message;
        }
        return null;
    }
}
