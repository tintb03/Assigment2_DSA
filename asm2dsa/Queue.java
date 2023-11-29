package ASSIGNMENT2;

class Queue<S> {
    private String[] queue;
    private int front;
    public int back;
    private int size;

    public Queue() {
        this.queue = new String[4];
        this.front = 0;
        this.back = 0;
        this.size = 4;
    }

    public boolean empty() {
        if (front == back)
            return true;
        else
            return false;
    }

    public boolean full() {
        if (((back + 1) % size) == front)
            return true;
        else
            return false;
    }

    public String peek() {
        if (empty())
            return null;

        return queue[front];
    }

    public String dequeue() {
        if (empty())
            return null;

        String temp = queue[front];
        queue[front] = null;
        front = (front + 1) % size;

        return temp;
    }

    public void enqueue(String value) {
        queue[back] = value;
        back = (back + 1) % size;
    }
}
