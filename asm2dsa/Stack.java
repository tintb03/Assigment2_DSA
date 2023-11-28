package asm2dsa;

public class Stack {
    private static final int MAX_SIZE = 10;  // Đặt giới hạn kích thước của ngăn xếp
    private String[] messages;
    private int top;

    public Stack() {
        this.messages = new String[MAX_SIZE];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(String message) {
        if (!isFull()) {
            messages[++top] = message;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return messages[top--];
        }
        return null;
    }
}

