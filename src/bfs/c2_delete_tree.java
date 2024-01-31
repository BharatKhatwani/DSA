package bfs;
import java.util.*;
public class c2_delete_tree {
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
        String[] arr = {"50", "20", "60", "17", "34", "55", "89",  "10", " ", "28", " ", " ", " ", "70", " "," ", "14"};
        Node root = construct_bfs(arr);
        preorder(root);
        System.out.println();
       delete(root,34);
       preorder(root);
    }



    private static void delete(Node root, int target) {
// deleted a leaf node in it
        if (root== null) return ;

        if (root.val >target) {  // go left
            if(root.left == null) return;
        if (root.left.val == target){
            Node l = root.left;
            if (l.left ==null  && l.right == null ){  // for leaf node condition 0 children
root.left = null;
            }
            else if (l.left == null || l.right == null){    // one child condition
                if (l.left != null) root.right = l.left ;
                else  root.left = l.right;
            }
        }
           else{
                delete(root.left, target);
            }
        }
        if (root.val <target) {  // go left
            if(root.right == null) return;
            if (root.right.val == target){
                Node r = root.right;
                if (r.left ==null  && r.right == null ){  // for leaf node condition 0 children
                    root.left = null;
                }
                else if (r.left == null || r.right == null){
                    if (r.left != null) root.right = r.left ;
                    else  root.left = r.right;
                }
            }

                else{
                delete(root.right, target);
            }
        }
    }

    private static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }



}
