package DAY15;


public class WordFrequencyDemo {
    // MyMapNode class with Key-Value pair
    static class MyMapNode<K, V> {
        K key;
        V value;
        MyMapNode<K, V> next;

        MyMapNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // LinkedList Hash Table
    static class MyLinkedHashTable<K, V> {
        private MyMapNode<K, V> head;

        // Add or update frequency
        public void add(K key, V value) {
            MyMapNode<K, V> temp = head;
            while (temp != null) {
                if (temp.key.equals(key)) {
                    // Update value if key exists
                    if (value instanceof Integer && temp.value instanceof Integer) {
                        temp.value = (V) Integer.valueOf((Integer) temp.value + (Integer) value);
                    } else {
                        temp.value = value;
                    }
                    return;
                }
                temp = temp.next;
            }
            // Insert new node at front
            MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
            newNode.next = head;
            head = newNode;
        }

        // Display all key-value pairs
        public void display() {
            MyMapNode<K, V> temp = head;
            while (temp != null) {
                System.out.println(temp.key + " -> " + temp.value);
                temp = temp.next;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        MyLinkedHashTable<String, Integer> hashTable = new MyLinkedHashTable<>();

        // Count frequency
        for (String word : words) {
            hashTable.add(word, 1);
        }

        System.out.println("Word Frequencies:");
        hashTable.display();
    }
}
