package DAY14;

public class SortedLinkedListDemo {
    // Node class with Comparable data
    static class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // SortedLinkedList class
    static class SortedLinkedList<T extends Comparable<T>> {
        Node<T> head;

        // Add method inserts in sorted order
        public void add(T data) {
            Node<T> newNode = new Node<>(data);

            // Case 1: Empty list or new node smaller than head
            if (head == null || head.data.compareTo(data) > 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            // Case 2: Traverse and insert at correct position
            Node<T> current = head;
            while (current.next != null && current.next.data.compareTo(data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        // Display the list
        public void display() {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();

        // Add elements in unsorted order
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Final Ordered LinkedList Sequence:");
        list.display(); // Output: 30 40 56 70
    }
}
