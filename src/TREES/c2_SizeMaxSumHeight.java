package TREES;

public class c2_SizeMaxSumHeight {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(Node root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }

    public static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }
public static int min (Node root){
        if (root== null) return Integer.MAX_VALUE;
        int a = root.val;
        int b =min (root.left);
        int c= min (root.right);
        return Math.min(a,Math.min(b,c));
}
    public static int height(Node root) {
        if (root == null) return 0;
        if (root.left== null && root.right == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int product  (Node root){
        if (root == null) return 1;
       // int a = product(root);
        int b = product (root.left);
        int c = product (root.right);
        return root.val*b*c;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        preorder(root);
        System.out.println();
        System.out.println("Size: " + size(root));
        System.out.println("Sum: " + sum(root));
        System.out.println("Max: " + max(root));
        System.out.println("Height: " + height(root));
        System.out.println("Minimum : " + min(root));
        System.out.println("Product :"  + product(root));
    }
}
