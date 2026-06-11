package DAY14;

public class LinkedListPopDemo {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;

        // Append node at the end
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Pop method: delete first element
        public void pop() {
            if (head != null) {
                head = head.next; // new head becomes the next node
            }
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

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Initial sequence: 56 -> 30 -> 70
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Original LinkedList:");
        list.display(); // Output: 56 30 70

        // Delete first element
        list.pop();

        System.out.println("After pop (delete first):");
        list.display(); // Output: 30 70
    }
}
