package DAY14;

public class LinkedListPopLastDemo {
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

        // PopLast method: delete last element
        public void popLast() {
            if (head == null) {
                return; // empty list
            }
            if (head.next == null) {
                head = null; // only one element
                return;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next; // move to second-last node
            }
            temp.next = null; // remove last node
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

        // Delete last element
        list.popLast();

        System.out.println("After popLast (delete last):");
        list.display(); // Output: 56 30
    }
}
