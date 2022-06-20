import java.util.LinkedList;

public class FunctionStackQueue {
    LinkedList<Integer> queue = new LinkedList<>();

    //Method to insert elements in the queue
    public void enQueue(int data) {
        queue.add(data);
    }

    //Method to print the elements of the queue
    public void toPrint() {
        System.out.println("Elements in the queue are :");
        for (Integer i : queue) {
            System.out.println(" " + i);
        }
    }
}
