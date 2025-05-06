
public class BST {
    static class Node {
        int data;
        Node right;
        Node Left;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.Left = insert(root.Left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={3,4,5,2,1};
        Node root=null;
        for(int i=0;i<values.length;i++){
            insert(root, values[i]);
        }
    }
}
