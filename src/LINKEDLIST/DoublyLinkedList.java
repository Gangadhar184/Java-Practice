package LINKEDLIST;

class Node2 {
    int data;  // node that stores the data
    Node2 next; // reference to the next node
    Node2 prev; // reference to the prev node

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    private Node2 head; //ref to first node
    private Node2 tail; // ref to last node
    private int size; // keep track of the no.of elements

    //constructor to create empty list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //empty
    public boolean isEmpty() {
        return head == null;
    }

    //size
    public int size() {
        return size;
    }

    // insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node2 newNode = new Node2(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            //list is not empty
            newNode.next = head; //nwe node points to current head
            head.prev = newNode; // current head's prev points to new node
            head = newNode; // update head to newNode
        }
        size++;
    }

    // insert at the end
    public void insertAtEnd(int data) {
        Node2 newNode = new Node2(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode; //current tail points to new node
            newNode.prev = tail; // new node's prev points to curr tail
            tail = newNode; // update tail
        }
        size++;
    }

    // display list from head to tail ( forward direction)
    public void displayForward() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.print("Forward : ");
        Node2 current = head; // start from head
        while(current != null){
            System.out.print(current.data   + " ");
            current = current.next;
        }
        System.out.println();
    }

    // display list from tail to head
    public void displayBackward() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.print("Backward: ");
        Node2 current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    //search for value in list
    public boolean search(int data) {
        Node2 current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next; // move to next
        }
        return false;

    }
    //get node at specific index
    private Node2 getNodeAt(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        Node2 current;
        //optimization: choose direction based on which is closer

        if(index < size / 2) {
            //start from forward direction
            current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
        }else {
            //start from tail
            current = tail;
            for(int i = size - 1; i > index; i--){
                current = current.prev;
            }
        }
        return current;
    }

    // delete the first occurrence of the value
    public boolean delete(int data) {
        if(isEmpty())  {
            return false;
        }
        Node2 current = head;

        //find the node to delete
        while(current != null && current.data != data){
            current = current.next;
        }
        if(current == null) return false;

        // now we found the node to dlete, handle diff cases
        //only one node in list
        if(head == tail) {
            head = null;
            tail = null;
        }
        //2 delete the head noe
        else if(current == head) {
            head = head.next; // move node to next node
            head.prev = null; // new head has no prev

        }
        //3 delete the tailnode
        else if(current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        //4 delete the middle
        else {
            current.prev.next = current.next; // bridge the gap
            current.next.prev = current.prev;
        }
        size--;
        return true;

    }

    // insert at specific position
    public boolean insertAt(int index, int data) {
        if(index < 0 || index > size){
            return  false;
        }
        //special cases for begin
        if(index == 0) {
            insertAtBeginning(data);
            return true;
        }
        if(index == size){
            insertAtEnd(data);
            return true;
        }
        //insert in middle
        Node2 newNode = new Node2(data);
        Node2 current = getNodeAt(index); //get node currently at position

        //insert before the current node
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
        return true;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("=== Testing Doubly Linked List ===");

        // Test insertions
        System.out.println("\n1. Testing insertions:");
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(5);
        dll.insertAtEnd(20);
        dll.insertAtEnd(25);
        dll.insertAt(2, 15);  // Insert 15 at position 2

        System.out.println("Size: " + dll.size());
        dll.displayForward();   // Should print: 5 10 15 20 25
        dll.displayBackward();  // Should print: 25 20 15 10 5

        // Test search
        System.out.println("\n2. Testing search:");
        System.out.println("Search for 15: " + dll.search(15)); // true
        System.out.println("Search for 30: " + dll.search(30)); // false

        // Test deletion
        System.out.println("\n3. Testing deletion:");
        dll.delete(15);  // Delete middle element
        dll.delete(5);   // Delete head
        dll.delete(25);  // Delete tail

        System.out.println("After deletions:");
        System.out.println("Size: " + dll.size());
        dll.displayForward();   // Should print: 10 20
        dll.displayBackward();  // Should print: 20 10
    }

}
