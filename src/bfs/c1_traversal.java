package bfs;
import java.util.LinkedList;
import java.util.Queue;

public class c1_traversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nth_order(Node root, int n) {
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nth_order(root.left, n - 1);
        nth_order(root.right, n - 1);
    }

    public static Node construct_bfs(String[] arr) {
        if (arr == null || arr.length == 0 || arr[0].equals(" ")) {
            return null;
        }

        int i = 0;
        int n = arr.length;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(arr[i]));
        q.add(root);

        while (!q.isEmpty() && i < n) {
            Node current = q.poll();
            i++;

            if (i < n && !arr[i].equals(" ")) {
                current.left = new Node(Integer.parseInt(arr[i]));
                q.add(current.left);
            }

            i++;

            if (i < n && !arr[i].equals(" ")) {
                current.right = new Node(Integer.parseInt(arr[i]));
                q.add(current.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6", " ", "7", " ", " ", "8", " ", " ", " ", "9", "10", "11"};
        Node root = construct_bfs(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }

    private static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    private static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}