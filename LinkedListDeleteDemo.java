package DAY14;

public class LinkedListDeleteDemo {
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
        public Node search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

        // Delete a node by key value
        public void delete(int key) {
            if (head == null) return;

            // If head itself is the node to be deleted
            if (head.data == key) {
                head = head.next;
                return;
            }

            Node temp = head;
            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next = temp.next.next; // unlink the node
            }
        }

        // Calculate size of LinkedList
        public int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
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

    // Main method for quick run
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        System.out.println("Original LinkedList:");
        list.display(); // Output: 56 30 40 70

        // Delete node with value 40
        list.delete(40);

        System.out.println("Final LinkedList Sequence:");
        list.display(); // Output: 56 30 70

        // Show size
        System.out.println("Size of LinkedList: " + list.size()); // Output: 3
    }
}
