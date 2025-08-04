package Queues;

public class MyQueue<T> {

    //inner class to represent each element in the queue
    private class Node {
        T data;
        Node next;

        //constructore for creating a new node
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //queue maintains references to front and rear
    private Node front; // points the first element (for dequeue)
    private Node rear; // points the last element (for enqueue)
    private int size; // keep the track of queue size

    //constructore to initialize empty queue
    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue: Add element to the rear of the queue
    public void enqueue(T data){
        Node newNode = new Node(data);
        if(rear == null) {
            front = rear = newNode;
        }
        //if queue has elements
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    //dequeue: Remove and return element fromthe front of queue
    public T dequeue() {
        //1 queue is empty
        if(front == null){
            throw new RuntimeException("Queue is empty - cannot dequeue");
        }
        //store the data to return
        T data = front.data;

        //move front pointer to next element
        front = front.next;

        // case2: queue becomes empty after dequeue
        if(front == null) {
            rear = null; // reseting rear pointer too
        }
        size--;
        return data;
    }
    // peek/front: view the front element without removing it
    public T peek() {
        if(front == null){
            throw new RuntimeException("queue is empty - cannot peek");
        }
        return front.data;
    }
    //check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }
    //get the size of the queue
    public int size() {
        return size;
    }
    //display queue contents
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("FRONT --> ");
        Node current = front;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("<-- Rear");
    }

    //main method for testing
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        System.out.println("=== Testing Queue Implementation ===");

        // Test isEmpty on empty queue
        System.out.println("Is empty: " + queue.isEmpty());

        // Test enqueue operations
        System.out.println("\nEnqueuing: 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
        System.out.println("Size: " + queue.size());

        // Test peek
        System.out.println("Front element (peek): " + queue.peek());

        // Test dequeue operations
        System.out.println("\nDequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Size after dequeue: " + queue.size());
        }

        System.out.println("Is empty: " + queue.isEmpty());
    }

}
