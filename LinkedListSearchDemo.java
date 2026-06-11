package DAY14;

public class LinkedListSearchDemo {
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

        // Search for a node with given key
        public boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true; // found
                }
                temp = temp.next;
            }
            return false; // not found
        }
    }

    // Main method for quick run
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Searching for 30: " + list.search(30)); // true
        System.out.println("Searching for 100: " + list.search(100)); // false
    }
}
