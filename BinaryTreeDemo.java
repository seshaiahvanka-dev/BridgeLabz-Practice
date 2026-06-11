package DAY15;

// Node class renamed to TreeNode
class TreeNode<K extends Comparable<K>> {
    private K key;
    private TreeNode<K> left;
    private TreeNode<K> right;

    public TreeNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public K getKey() {
        return key;
    }

    public TreeNode<K> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<K> left) {
        this.left = left;
    }

    public TreeNode<K> getRight() {
        return right;
    }

    public void setRight(TreeNode<K> right) {
        this.right = right;
    }
}

// Binary Tree class
class BinaryTree<K extends Comparable<K>> {
    private TreeNode<K> root;

    public void add(K key) {
        root = addRec(root, key);
    }

    private TreeNode<K> addRec(TreeNode<K> current, K key) {
        if (current == null) {
            return new TreeNode<>(key);
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

    private int sizeRec(TreeNode<K> node) {
        if (node == null) return 0;
        return 1 + sizeRec(node.getLeft()) + sizeRec(node.getRight());
    }

    public void inorderTraversal(TreeNode<K> node) {
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
}

// Main class
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

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
    }
}
