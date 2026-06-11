package DAY14;

public class LinkedListInsertBetweenDemo {
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

        // Insert a node after a given value
        public void insertAfter(int target, int data) {
            Node temp = head;
            while (temp != null && temp.data != target) {
                temp = temp.next;
            }
            if (temp != null) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
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

        // Step 1: Create 56 and 70
        list.append(56);
        list.append(70);

        // Step 2: Insert 30 between 56 and 70
        list.insertAfter(56, 30);

        System.out.println("Final LinkedList Sequence:");
        list.display(); // Output: 56 30 70
    }
}
