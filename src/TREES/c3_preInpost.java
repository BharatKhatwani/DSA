package TREES;
import linkedlist.c2_implementation;

import java.util.*;
public class c3_preInpost {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
public static  void preorder(Node root){
        // left root.val  right
        if (root== null) return ;
    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
}
public static void inorder(Node root){
        if (root== null) return ;
        inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);

}

    public static void nth_order(Node root, int n){
        if (root== null) return ;
        if (n ==1) {
            System.out.print(root.val +  " ");
            return ;
        }
        nth_order(root.left,n-1);

      nth_order(root.right, n-1);

    }


    public static void nth_order_2(Node root, int n){
        if (root== null) return ;
        if (n ==1) {
            System.out.print(root.val +  " ");
            return ;
        }


        nth_order(root.right, n-1);
        nth_order(root.left,n-1);
    }



    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
    }


public static void bfs(Node root){
        Queue<Node> q =new LinkedList<>();
        if (root!=null) {
            q.add (root);
        }
    while (q.size() >0) {
        Node temp= q.peek();
        if (temp.left!= null){
            q.add(temp.left);
        }
        if (temp.right !=null){
            q.add(temp.right);
        }
        System.out.print(temp.val + " ");
        q.remove();

    }
}





    public static void main(String[] args) {
        //pip(2);

            Node root = new Node(1);
            Node a = new Node(2);
            Node b = new Node(3);
            root.left = a;
            root.right = b;
            Node c = new Node(4);
            Node d = new Node(5);
            a.left = c;
            a.right = d;
Node e = new Node (6);
b.left = e;
            Node f = new Node(7);
            b.right = f;
//preorder(root);
     //   inorder(root);
       // postfix(root);
     //   nth_order(root,3);


        int level = height(root)+1;
//        for (int i =0; i <= level; i++){
//            nth_order(root,i);
//            System.out.println();
//        }

       // bfs(root);
        for (int i =0 ; i <= level; i++){
            nth_order_2(root,i);
            System.out.println();
        }



    }
    public static void postfix(Node root){
        if (root == null) return ;
        postfix(root.left);
        postfix(root.right);
        System.out.println(root.val);
    }
    public static void pip(int n){

        if (n==0){
            return ;
        }
        System.out.println("pre" + n);
        pip(n-1);
        System.out.println("In" + n);
        pip(n-1);
        System.out.println("Post" + n);
    }



}
