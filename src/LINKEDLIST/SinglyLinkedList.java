package LINKEDLIST;

// node class - represents individual elements in the linked list


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList  {
    private Node head;
    private int size;

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    //Insert at the specific index
    public void insertAtPosition(int data, int position) {
        if(position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if(position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //Delete from the beginning
    public int deleteFromBeginning() {
        if (head == null) {
            throw new RuntimeException("List is Empty");
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //delete from the end
    public int deleteFromEnd() {
        if(head == null) {
            throw new RuntimeException("List is empty");
        }
        if(head.next == null) {
            int val = head.data;
            head = null;
            size--;
            return val;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }

    //get element at specific position
    public int get(int position) {
        if(position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("invalid position");
        }
        Node temp = head;
        for(int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //get the list size
    public int size() {
        return size;
    }

    //check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    //display the list
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // find the middle
    public int findMiddle() {
        if(head == null) {
            throw new RuntimeException("List is empty");
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //detect cycle
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    //remove by value -> remove first occurence of given value

    public void removeByValue(int value) {
        if(head == null) return;

        if(head.data == value) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data == value) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    //remove duplicates
    public void removeDuplicates() {
        if(head == null) return;
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                    size--;
                }else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // merge singly linked list
    public void merge(SinglyLinkedList other) {
        if(other.head == null) return;
        if(this.head == null) {
            this.head = other.head;
            this.size = other.size;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = other.head;
        this.size += other.size;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(15);
        list.insertAtPosition(7, 1);
        list.display(); // 5 -> 7 -> 10 -> 15 -> null

        System.out.println("Deleted from beginning: " + list.deleteFromBeginning());
        System.out.println("Deleted from end: " + list.deleteFromEnd());
        list.display(); // 7 -> 10 -> null

        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display(); // 7 -> 10 -> 20 -> 30 -> 40 -> null


        list.removeDuplicates();
        System.out.print("After removing duplicates: ");
        list.display();

        list.removeByValue(30);
        System.out.print("After removing value 30: ");
        list.display();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertAtEnd(40);
        list2.insertAtEnd(50);

        list.merge(list2);
        System.out.print("After merging: ");
        list.display();

    }

}

