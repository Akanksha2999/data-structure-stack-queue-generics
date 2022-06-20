import java.util.LinkedList;

public class FunctionStackQueue {
    LinkedList<Integer> stack = new LinkedList<>();

    //Method to insert elements in the stack
    public void insert(int data) {
        stack.addFirst(data);
    }

    //Method to print the elements of the stack
    public void toPrint() {
        System.out.println("Elements in the stack are :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}
