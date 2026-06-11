package DAY14;

public class LinkedListInsertAfterDemo {
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
                    return temp; // return node if found
                }
                temp = temp.next;
            }
            return null; // not found
        }

        // Insert after a given node
        public void insertAfter(Node node, int data) {
            if (node != null) {
                Node newNode = new Node(data);
                newNode.next = node.next;
                node.next = newNode;
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

    // Main method for quick run
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Original LinkedList:");
        list.display(); // Output: 56 30 70

        // Search for node with value 30
        Node node30 = list.search(30);

        // Insert 40 after 30
        list.insertAfter(node30, 40);

        System.out.println("Final LinkedList Sequence:");
        list.display(); // Output: 56 30 40 70
    }
}
