package DAY14;

public class StackUsingLinkedListDemo {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with addFirst
    static class LinkedList {
        Node head;

        // Add node at the front (used for push)
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Remove node from front (used for pop)
        public int removeFirst() {
            if (head == null) throw new RuntimeException("Stack is empty");
            int value = head.data;
            head = head.next;
            return value;
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

    // Stack class using LinkedList
    static class Stack {
        LinkedList list = new LinkedList();

        // Push operation
        public void push(int data) {
            list.addFirst(data);
        }

        // Pop operation
        public int pop() {
            return list.removeFirst();
        }

        // Display stack
        public void display() {
            list.display();
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements: 70, 30, 56
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack Sequence (Top to Bottom):");
        stack.display(); // Output: 56 30 70
    }
}
