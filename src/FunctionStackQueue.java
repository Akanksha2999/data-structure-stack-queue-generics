import java.util.LinkedList;

public class FunctionStackQueue {
    LinkedList<Integer> stack = new LinkedList<>();

    //Method to insert elements in the stack
    public void insert(int data) {
        stack.addFirst(data);
    }

    //Method to show the top element in stack
    public void peek() {
        System.out.println("Element at peek in stack is :" + stack.peek());
    }

    //Method to remove the element from the stack
    public void pop() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Element removed from the stack is: " + stack.pop());
        }
    }

    //Method to print the elements of the stack
    public void toPrint() {
        System.out.println("Elements in the stack are :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}
