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
        if (root == null) {
            return 0;
        }
        int leftnodes = countNode(root.left);
        int rightnodes = countNode(root.right);
        return leftnodes + rightnodes + 1;
    }

    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = sumNode(root.left);
        int rightnodes = sumNode(root.right);
        return leftnodes + rightnodes + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = height(root.left);
        int rightnodes = height(root.right);
        return Math.max(leftnodes, rightnodes) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam2, diam1));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myheight = Math.max(right.ht, left.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam2, Math.max(diam1, diam3));

        TreeInfo newInfo = new TreeInfo(myheight, mydiam);

        return newInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);
        // Levelorder(root);

        System.out.println(diameter2(root).diam);
    }
}
