import java.util.LinkedList;

public class StackAndQueue {
    public static void main(String[] args) {

        FunctionStackQueue functionStackQueue = new FunctionStackQueue();

        //Inserted elements in the queue and printing it
        functionStackQueue.enQueue(56);
        functionStackQueue.enQueue(30);
        functionStackQueue.enQueue(70);
        functionStackQueue.toPrint();
        //Removed elements from the queue
        functionStackQueue.deQueue();
        functionStackQueue.toPrint();
        functionStackQueue.deQueue();
        functionStackQueue.toPrint();
        functionStackQueue.deQueue();
        functionStackQueue.toPrint();
        functionStackQueue.deQueue();

    }
}
