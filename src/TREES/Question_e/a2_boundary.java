package TREES.Question_e;
import java.util.*;

public class a2_boundary {
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
        if (arr == null || arr.length == 0) return null;

        int index = 0;
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(Integer.parseInt(arr[index++]));
        queue.add(root);

        while (!queue.isEmpty() && index < arr.length) {
            Node current = queue.poll();

            String leftVal = arr[index++];
            if (!leftVal.equals(" ")) {
                current.left = new Node(Integer.parseInt(leftVal));
                queue.add(current.left);
            }

            if (index < arr.length) {
                String rightVal = arr[index++];
                if (!rightVal.equals(" ")) {
                    current.right = new Node(Integer.parseInt(rightVal));
                    queue.add(current.right);
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", " ", "6", "7", " ", "8", " ", "9", "10", " ", "11", " ", "12", " ", "13", " ", "14", "15", "16", " ", "17", " ", " ", "18", " ", "19", " ", " ", " ", "20", "21", "22", "23", " ", "24", "25", "26", "27", " ", " ", "28"};

        Node root = construct_bfs(arr);
        int level = height(root);
//        for (int i = 1; i <= level; i++) {
//            nth_order(root, i);
//            System.out.println();
//        }
        boundary_count(root);

    }

    private static void boundary_count(Node root) {
        leftboundary(root);
        System.out.println();
        bootomboundary(root);
        System.out.println();
        rightboundary(root.right);

    }

    private static void rightboundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {

            return;
        }
        if (root.right != null) {
            rightboundary(root.right);
        } else {
            rightboundary(root.left);
        }
        System.out.print(root.val + " ");
        
    }

    private static void bootomboundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
            return;
        }
        bootomboundary(root.left);
        bootomboundary(root.right);
    }

    private static void leftboundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {

            return;
        }
        System.out.print(root.val + " ");
        if (root.left != null) {
            leftboundary(root.left);
        } else {
            leftboundary(root.right);
        }
    }
}
