package DAY15;

// Node interface
interface INode<K extends Comparable<K>> {
    K getKey();
    void setKey(K key);
    INode<K> getLeft();
    void setLeft(INode<K> left);
    INode<K> getRight();
    void setRight(INode<K> right);
}

// MyBinaryNode implementing INode
class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
    private K key;
    private INode<K> left;
    private INode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getLeft() {
        return left;
    }

    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }

    @Override
    public INode<K> getRight() {
        return right;
    }

    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }
}

// Binary Search Tree class
class BinarySearchTree<K extends Comparable<K>> {
    private INode<K> root;

    public void add(K key) {
        root = addRec(root, key);
    }

    private INode<K> addRec(INode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRec(current.getLeft(), key));
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRec(current.getRight(), key));
        }
        return current;
    }

    // Inorder traversal to display sorted sequence
    public void inorderTraversal(INode<K> node) {
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
public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Add nodes: 56 (root), then 30 (left), then 70 (right)
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("BST Inorder Traversal (Sorted):");
        bst.display(); // Output: 30 56 70
    }
}
