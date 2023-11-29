package ASSIGNMENT2;

public class Stack {
    private String[] stack;
    private int top;

    public Stack() {
        this.stack = new String[3];
        this.top = -1;
    }

    public boolean empty() {
        return top < 0;
    }

    public boolean full() {
        return top >= 2;
    }

    public String peek() {
        if (empty())
            return null;

        return stack[top];
    }

    public String pop() {
        if (empty())
            return null;

        String temp = peek();
        top--;

        return temp;
    }

    public void push(String value) {
        top++;
        stack[top] = value;
    }
}