package STACK;

// LinkedList-based implementation of a generic Stack in Java
public class LinkedListStack<T> {

    // Step 1: Define the Node structure - each element in the stack
    private static class Node<T> {
        T data;           // Data stored in the node
        Node<T> next;     // Pointer to the next node

        // Constructor
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Step 2: Stack state (top of stack and size tracker)
    private Node<T> top;   // Reference to the top element
    private int size;      // Number of elements in the stack

    // Step 3: Constructor to initialize an empty stack
    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    // Step 4: Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Step 5: Return the number of elements in the stack
    public int size() {
        return size;
    }

    // Step 6: Push a new element to the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);  // Create new node
        newNode.next = top;                  // Link it to current top
        top = newNode;                       // Update top to new node
        size++;                              // Increase size
    }

    // Step 7: Peek the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - cannot peek");
        }
        return top.data;
    }

    // Step 8: Pop the top element and return it
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - cannot pop");
        }
        T data = top.data;     // Store data to return
        top = top.next;        // Move top to next node
        size--;                // Decrease size
        return data;
    }

    // Step 9: toString() for visualization and debugging
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack: [] (empty)";
        }

        StringBuilder sb = new StringBuilder("Stack: [TOP: ");
        Node<T> current = top;

        sb.append(current.data);       // Add top node
        current = current.next;

        while (current != null) {
            sb.append(" -> ").append(current.data);
            current = current.next;
        }

        sb.append(" -> null]");
        return sb.toString();
    }

    // Step 10: Main method to test the stack implementation
    public static void main(String[] args) {
        System.out.println("=== LinkedList Stack Implementation Test ===\n");

        // Create a stack of Strings
        LinkedListStack<String> stack = new LinkedListStack<>();

        System.out.println("=== Testing Empty Stack ===");
        System.out.println(stack);
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        // Push elements
        System.out.println("\n=== Testing Push Operations ===");
        stack.push("First");
        System.out.println("Pushed 'First': " + stack);

        stack.push("Second");
        System.out.println("Pushed 'Second': " + stack);

        stack.push("Third");
        System.out.println("Pushed 'Third': " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        // Peek top element
        System.out.println("\n=== Testing Peek Operation ===");
        System.out.println("Peek: " + stack.peek());
        System.out.println("After peek: " + stack);

        // Pop elements
        System.out.println("\n=== Testing Pop Operations ===");
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println("Is empty: " + stack.isEmpty());

        // Test exceptions
        System.out.println("\n=== Testing Error Conditions ===");
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Expected error on pop: " + e.getMessage());
        }

        try {
            stack.peek();
        } catch (RuntimeException e) {
            System.out.println("Expected error on peek: " + e.getMessage());
        }

        // Test with Integer stack
        System.out.println("\n=== Testing with Numbers ===");
        LinkedListStack<Integer> numStack = new LinkedListStack<>();

        for (int i = 1; i <= 5; i++) {
            numStack.push(i * 10);
            System.out.println("Pushed " + (i * 10) + ": " + numStack);
        }

        System.out.println("\nPopping all elements:");
        while (!numStack.isEmpty()) {
            System.out.println("Popped: " + numStack.pop() + ", Remaining: " + numStack);
        }
    }
}
