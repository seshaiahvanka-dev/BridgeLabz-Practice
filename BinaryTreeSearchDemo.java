package DAY15;

// Node class renamed to BTNode
class BTNode<K extends Comparable<K>> {
    private K key;
    private BTNode<K> left;
    private BTNode<K> right;

    public BTNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public K getKey() {
        return key;
    }

    public BTNode<K> getLeft() {
        return left;
    }

    public void setLeft(BTNode<K> left) {
        this.left = left;
    }

    public BTNode<K> getRight() {
        return right;
    }

    public void setRight(BTNode<K> right) {
        this.right = right;
    }
}

// Binary Tree class renamed to CustomBinaryTree
class CustomBinaryTree<K extends Comparable<K>> {
    private BTNode<K> root;

    public void add(K key) {
        root = addRec(root, key);
    }

    private BTNode<K> addRec(BTNode<K> current, K key) {
        if (current == null) {
            return new BTNode<>(key);
        }
        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRec(current.getLeft(), key));
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRec(current.getRight(), key));
        }
        return current;
    }

    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(BTNode<K> node) {
        if (node == null) return 0;
        return 1 + sizeRec(node.getLeft()) + sizeRec(node.getRight());
    }

    public void inorderTraversal(BTNode<K> node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRight());
        }
    }

    public void display() {
        inorderTraversal(root);
        System.out.println();
    }

    // ✅ Search method
    public boolean search(K key) {
        return searchRec(root, key);
    }

    private boolean searchRec(BTNode<K> current, K key) {
        if (current == null) return false;
        if (key.compareTo(current.getKey()) == 0) return true;
        if (key.compareTo(current.getKey()) < 0) {
            return searchRec(current.getLeft(), key);
        } else {
            return searchRec(current.getRight(), key);
        }
    }
}

// Main class renamed to CustomBinaryTreeDemo
public class BinaryTreeSearchDemo {
    public static void main(String[] args) {
        CustomBinaryTree<Integer> tree = new CustomBinaryTree<>();

        // Build the tree as shown in the figure
        tree.add(56);
        tree.add(30);
        tree.add(70);
        tree.add(22);
        tree.add(40);
        tree.add(11);
        tree.add(3);
        tree.add(16);
        tree.add(60);
        tree.add(95);
        tree.add(65);
        tree.add(63);
        tree.add(67);

        System.out.println("Inorder Traversal of Tree:");
        tree.display(); // Sorted order

        System.out.println("Size of Tree: " + tree.size()); // Should be 13

        // ✅ Search for 63
        System.out.println("Search for 63: " + tree.search(63)); // true
        System.out.println("Search for 100: " + tree.search(100)); // false
    }
}
