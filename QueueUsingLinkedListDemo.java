package DAY14;

public class QueueUsingLinkedListDemo {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with append and removeFirst
    static class LinkedList {
        Node head;

        // Append node at the end (used for enqueue)
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

        // Remove node from front (used for dequeue)
        public int removeFirst() {
            if (head == null) throw new RuntimeException("Queue is empty");
            int value = head.data;
            head = head.next;
            return value;
        }

        // Peek at the front node
        public int peekFirst() {
            if (head == null) throw new RuntimeException("Queue is empty");
            return head.data;
        }

        // Check if empty
        public boolean isEmpty() {
            return head == null;
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

    // Queue class using LinkedList
    static class Queue {
        LinkedList list = new LinkedList();

        public void enqueue(int data) {
            list.append(data);
        }

        public int dequeue() {
            return list.removeFirst();
        }

        public int peek() {
            return list.peekFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void display() {
            list.display();
        }
    }

    // Main method
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements: 56, 30, 70
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Queue Sequence (Front to Rear):");
        queue.display(); // Output: 56 30 70

        // Peek front
        System.out.println("Peek front: " + queue.peek()); // 56

        // Dequeue all
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
