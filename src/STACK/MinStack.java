package STACK;



import java.util.EmptyStackException;
import java.util.Stack;

/**
 * A stack implementation that supports finding the minimum element in o(1) time
 * Each element is stored as a pair: the element itself and the minimum value
 * from this element down to the bottom of the stack
 */

public class MinStack {
    //stack to store pair of (element, minimum_from_this_point_down)
    private final Stack<Pair> stack;

    //Inner class to represent a pair of integers
    private static class Pair{
        int element;
        int minFromHere;

        public Pair(int element, int minFromHere){
            this.element = element;
            this.minFromHere = minFromHere;
        }
    }

    //initialize the stack(constructor)
    public MinStack(){
        stack = new Stack<>();
    }

    /**
     * Add an element to the top of the stack in o(1) time
     * @param newElement the element to be added
     */
    public void push(int newElement){
        int newMin = stack.isEmpty() ? newElement : Math.min(newElement, stack.peek().minFromHere);
        stack.push(new Pair(newElement, newMin));
    }

    /**
     * Removes and returns the top element from the stack in o(1) time
     * @return the removed element
     * @throws java.util.EmptyStackException if stack is empty
     */
    public int pop() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        int removedElement = stack.peek().element;
        stack.pop();
        return removedElement;
    }

    /**
     * Returns the top element without removing it in O(1) time
     * @return the top element
     * @throws EmptyStackException if the stack is empty
     */
    public int top() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek().element;
    }

    /**
     * Returns the minimum element in the stack in O(1) time
     * @return the minimum element
     * @throws EmptyStackException if the stack is empty
     */
    public int getMin() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek().minFromHere;
    }
    /**
    * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the number of elements in the stack
     * @return the size of the stack
     */
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Test adding elements
        minStack.push(5);
        System.out.println("Pushed 5, min: " + minStack.getMin()); // min: 5

        minStack.push(3);
        System.out.println("Pushed 3, min: " + minStack.getMin()); // min: 3

        minStack.push(7);
        System.out.println("Pushed 7, min: " + minStack.getMin()); // min: 3

        minStack.push(1);
        System.out.println("Pushed 1, min: " + minStack.getMin()); // min: 1

        // Test removing elements
        System.out.println("Popped: " + minStack.pop() + ", min: " + minStack.getMin()); // popped: 1, min: 3
        System.out.println("Popped: " + minStack.pop() + ", min: " + minStack.getMin()); // popped: 7, min: 3
        System.out.println("Popped: " + minStack.pop() + ", min: " + minStack.getMin()); // popped: 3, min: 5

        System.out.println("Top element: " + minStack.top()); // top: 5
        System.out.println("Stack size: " + minStack.size()); // size: 1
    }

}
