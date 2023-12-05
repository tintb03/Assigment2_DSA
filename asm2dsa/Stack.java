package ASMlan4;

public class Stack {
    private static final int MAX_STACK_SIZE = 1;

    private String[] stack;
    private int top;

    public Stack() {
        this.stack = new String[MAX_STACK_SIZE];
        this.top = -1;
    }

    public void push(String message) {
        if (!isFull()) {
            stack[++top] = message;
        }
    }

    public String pop() {
        String message = null;
        if (!isEmpty()) {
            message = stack[top--];
        }
        return message;
    }

    public boolean isFull() {
        return top >= MAX_STACK_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void displayStack() {
        System.out.print("Stack hiện tại: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) {
                System.out.print("; ");
            }
        }
        System.out.println();
    }
}


