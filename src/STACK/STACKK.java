package STACK;

import java.util.ArrayList;

public class STACKK <T> {
    // we use ArrayList as our underlying storage
    private ArrayList<T> items;

    //constructor -> initilize the stack
    public STACKK() {
        items = new ArrayList<>();
    }

    //checks if stack has no element
    public boolean isEmpty() {
        return items.isEmpty();
    }
    // push() add element to top of stack
    public void push(T item){
        //add elem at end of arrayList -> Top of the stack
        items.add(item);
    }
    //get the number of elements
    public int size() {
        return items.size();
    }
    // peek() looking at top element without removing it
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        //get the last element using get(lastIndex)
        return items.get(items.size()-1);
    }
    //pop -> remove and return the top element
    public T pop() {
        if(isEmpty())  {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }
    //toString()
    public String toString() {
        if(isEmpty()){
            return "STACK: []";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [");
        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i));
            if(i < items.size() - 1){
                sb.append(", ");
            }
        }
        sb.append("]  <-- top");
        return sb.toString();
    }

    public static void main(String[] args) {
        STACKK<Integer> stack = new STACKK<>();

        System.out.println("New stack: " + stack);
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        // Test push operations
        System.out.println("\n--- Testing Push Operations ---");
        stack.push(10);
        System.out.println("After push(10): " + stack);

        stack.push(20);
        System.out.println("After push(20): " + stack);

        stack.push(30);
        System.out.println("After push(30): " + stack);

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        // Test peek operation
        System.out.println("\n--- Testing Peek Operation ---");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stack after peek: " + stack);

        // Test pop operations
        System.out.println("\n--- Testing Pop Operations ---");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is empty: " + stack.isEmpty());

        // Test error handling
        System.out.println("\n--- Testing Error Handling ---");
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        try {
            stack.peek();
        } catch (RuntimeException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }

    
}
