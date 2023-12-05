package ASMlan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue messageQueue = new Queue();
        Stack messageStack = new Stack();
        System.out.println("Hello!!!");
        boolean continueMessaging = true;

        while (continueMessaging) {
            //messageQueue.displayQueue();

            System.out.println("Nhập tin nhắn: ");
            String message = scanner.nextLine();

            if (isValidMessage(message)) {
                processValidMessage(message, messageQueue, messageStack);
            } else {
                System.out.println("Tin nhắn không hợp lệ. Độ dài tin nhắn phải dưới 20 ký tự.");
            }

            if (messageQueue.isFull()) {
                String dequeuedMessage = messageQueue.dequeue();
                System.out.println("Queue đã đầy. Tin nhắn đã được Dequeue: " + dequeuedMessage);
                messageStack.push(dequeuedMessage);
                System.out.println("Tin nhắn được Push vào Stack: " + dequeuedMessage);
            }
            if (messageStack.isFull()) {
                String poppedMessage = messageStack.pop();
                System.out.println("Stack đã đầy. Tin nhắn đã được Pop từ Stack và hiển thị cho người dùng: " + poppedMessage);
            }
            messageQueue.displayQueue();
            //messageStack.displayStack();
        }
        scanner.close();
    }
    private static boolean isValidMessage(String message) {
        return message.length() < 20;
    }
    private static void processValidMessage(String message, Queue messageQueue, Stack messageStack) {
        messageQueue.enqueue(message);
        System.out.println("Tin nhắn hợp lệ và được enqueue vào Queue.");
    }
}
