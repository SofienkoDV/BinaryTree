class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTree {
    Node root;
    void insert(int data) {
        root = insertRecursive(root, data);
    }
    Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }
    void inorder() {
        inorderRecursive(root);
    }
    void inorderRecursive(Node current) {
        if (current != null) {
            inorderRecursive(current.left);
            System.out.print(current.data + " ");
            inorderRecursive(current.right);
        }
    }
}
class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        System.out.println("Inorder traversal: ");
        bt.inorder();
    }
}