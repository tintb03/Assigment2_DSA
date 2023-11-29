package ASSIGNMENT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        String message = "";

        while (true) {
            System.out.print("Enter message: ");
            message = sc.nextLine();

            if (message.length() > 250) {
                System.out.println("Invalid message");
                break;
            }

            if (queue.full()) {
                System.out.println("Queue is full");
                break;
            } else
                queue.enqueue(message);

            if (queue.empty()) {
                System.out.println("Queue is empty");
                return;
            } else
                message = queue.peek(); // 1

            if (stack.full()) {
                System.out.println("Stack is full");
                return;
            } else
                stack.push(message); // 1

            message = stack.pop();
            System.out.println("Message is: " + message);
        }
    }
}
