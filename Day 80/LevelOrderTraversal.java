import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);
            return newnode;
        }
    }

    public static void Levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNode(Node root) {
        if(root==null){
            return 0;
        }
        int leftnodes = countNode(root.left);
        int rightnodes = countNode(root.right);
        return leftnodes + rightnodes + 1;
    }
    public static int sumNode(Node root) {
        if(root==null){
            return 0;
        }
        int leftnodes = sumNode(root.left);
        int rightnodes = sumNode(root.right);
        return leftnodes + rightnodes + root.data;
    }
    public static int height(Node root) {
        if(root==null){
            return 0;
        }
        int leftnodes = height(root.left);
        int rightnodes = height(root.right);
        return Math.max(leftnodes, rightnodes)+1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        Levelorder(root);
        
        System.out.println(height(root));
    }
}
