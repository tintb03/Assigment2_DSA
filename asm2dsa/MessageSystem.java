package asm2dsa;

public class MessageSystem {
    public static void main(String[] args) {
        Queue messageQueue = new Queue();
        Stack messageStack = new Stack();

        // Người dùng nhập một thông điệp
        String userInput = "Hello, World!";

        // Kiểm tra đầu vào
        if (userInput.length() <= 250) {
            // Đưa vào hàng đợi nếu đầu vào hợp lệ và hàng đợi không đầy
            if (!messageQueue.isFull()) {
                messageQueue.enqueue(userInput);

                // Dequeue và push vào stack
                String dequeuedMessage = messageQueue.dequeue();
                if (dequeuedMessage != null) {
                    messageStack.push(dequeuedMessage);

                    // Hiển thị thông điệp cho người dùng
                    String poppedMessage = messageStack.pop();
                    if (poppedMessage != null) {
                        System.out.println("Displayed Message: " + poppedMessage);
                    }
                }
            } else {
                System.out.println("Error: Queue is full.");
            }
        } else {
            System.out.println("Error: Invalid message length.");
        }
    }
}
