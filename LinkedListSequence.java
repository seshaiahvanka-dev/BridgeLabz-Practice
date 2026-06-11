package DAY14;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add node at the front
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // link new node to current head
        head = newNode;      // update head
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListSequence {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Step 1: Node with data 70 is first created
        list.addFirst(70);

        // Step 2: Next 30 is added before 70
        list.addFirst(30);

        // Step 3: Finally 56 is added before 30
        list.addFirst(56);

        System.out.println("LinkedList Sequence:");
        list.display(); // Output: 56 30 70
    }
}

