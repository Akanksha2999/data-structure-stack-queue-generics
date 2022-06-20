import java.util.LinkedList;

public class StackAndQueue {
    public static void main(String[] args) {

        FunctionStackQueue functionStackQueue = new FunctionStackQueue();

        //Inserted elements in the stack and printing it
        functionStackQueue.insert(70);
        functionStackQueue.insert(30);
        functionStackQueue.insert(56);
        functionStackQueue.toPrint();

        //Elements removed from the stack until the list is not empty
        functionStackQueue.peek();
        functionStackQueue.pop();
        functionStackQueue.toPrint();
        functionStackQueue.peek();
        functionStackQueue.pop();
        functionStackQueue.toPrint();
        functionStackQueue.peek();
        functionStackQueue.pop();
        functionStackQueue.toPrint();
        functionStackQueue.peek();
        functionStackQueue.pop();
    }
}
