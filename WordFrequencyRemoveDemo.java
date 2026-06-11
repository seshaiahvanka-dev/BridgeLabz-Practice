package DAY15;

public class WordFrequencyRemoveDemo {
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

    // Hash Table with LinkedList buckets
    static class MyHashTable<K, V> {
        private int bucketSize;
        private MyMapNode<K, V>[] buckets;

        @SuppressWarnings("unchecked")
        public MyHashTable(int bucketSize) {
            this.bucketSize = bucketSize;
            this.buckets = new MyMapNode[bucketSize];
        }

        // Hash function
        private int getIndex(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode % bucketSize);
        }

        // Add or update frequency
        public void add(K key, V value) {
            int index = getIndex(key);
            MyMapNode<K, V> head = buckets[index];

            // Search if key exists
            MyMapNode<K, V> temp = head;
            while (temp != null) {
                if (temp.key.equals(key)) {
                    if (value instanceof Integer && temp.value instanceof Integer) {
                        temp.value = (V) Integer.valueOf((Integer) temp.value + (Integer) value);
                    } else {
                        temp.value = value;
                    }
                    return;
                }
                temp = temp.next;
            }

            // Insert new node at front of bucket
            MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
            newNode.next = head;
            buckets[index] = newNode;
        }

        // Remove a key
        public void remove(K key) {
            int index = getIndex(key);
            MyMapNode<K, V> head = buckets[index];

            if (head == null) return;

            // If head itself is the key
            if (head.key.equals(key)) {
                buckets[index] = head.next;
                return;
            }

            // Traverse to find the key
            MyMapNode<K, V> prev = head;
            MyMapNode<K, V> curr = head.next;
            while (curr != null) {
                if (curr.key.equals(key)) {
                    prev.next = curr.next; // unlink node
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }

        // Display all key-value pairs
        public void display() {
            for (int i = 0; i < bucketSize; i++) {
                MyMapNode<K, V> temp = buckets[i];
                while (temp != null) {
                    System.out.println(temp.key + " -> " + temp.value);
                    temp = temp.next;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                           "because they keep putting themselves deliberately into " +
                           "paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>(10);

        // Count frequency
        for (String word : words) {
            hashTable.add(word, 1);
        }

        System.out.println("Word Frequencies Before Removal:");
        hashTable.display();

        // Remove "avoidable"
        hashTable.remove("avoidable");

        System.out.println("\nWord Frequencies After Removing 'avoidable':");
        hashTable.display();
    }
}
