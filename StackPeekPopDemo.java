package DAY14;

public class StackPeekPopDemo {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with addFirst/removeFirst
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

        // Peek at the front node
        public int peekFirst() {
            if (head == null) throw new RuntimeException("Stack is empty");
            return head.data;
        }

        // Check if empty
        public boolean isEmpty() {
            return head == null;
        }
    }

    // Stack class using LinkedList
    static class Stack {
        LinkedList list = new LinkedList();

        public void push(int data) {
            list.addFirst(data);
        }

        public int pop() {
            return list.removeFirst();
        }

        public int peek() {
            return list.peekFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements: 70, 30, 56 (so 56 is on top)
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Peeking top element: " + stack.peek()); // 56

        // Pop until empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
