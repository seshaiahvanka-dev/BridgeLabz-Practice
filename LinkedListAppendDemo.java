package DAY14;

public class LinkedListAppendDemo {
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
                head = newNode; // first node
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next; // move to last node
                }
                temp.next = newNode; // link new node at end
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

        // Step 1: Node with data 56 is first created
        list.append(56);

        // Step 2: Append 30 to 56
        list.append(30);

        // Step 3: Append 70 to 30
        list.append(70);

        System.out.println("LinkedList Sequence:");
        list.display(); // Output: 56 30 70
    }
}
