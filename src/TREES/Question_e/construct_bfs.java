package TREES.Question_e;

import TREES.c3_preInpost;

import java.util.*;

public class construct_bfs {
   public static  class Node {
        int val;
        Node left ;
        Node right ;
       Node (int val){
           this.val = val;
       }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
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


    public static Node construct_bfs(String [] arr){
int x = Integer.parseInt(arr[0]);
Node root = new Node(x);
Queue<Node > q = new LinkedList<>();
int i = 1;
int n= arr.length ;
q.add(root);
while (i < n-1){
   Node temp = q.remove();


   Node left = new Node (10);
   Node right = new Node (100);
   if (arr[i].equals(" ")){
       left = null;
   }else {
       int l = Integer.parseInt(arr[i]);
       q.add (left);
   }
   if (arr[i+1].equals(" ")){
       right = null;
   }else {

       int r = Integer.parseInt(arr[i+1]);
       q.add(right);
   }
   temp.left= left;
   temp.right = right;




}
return root;
    }
    public static void main(String[] args) {


//       String str = "1";
//
//       int x= Integer.parseInt(str);
//        System.out.println(x + 10);

        String[] arr = {"1", "2","3", "4", "5", "6", "", "7","","","8","","","","9","10","11"};

Node root = construct_bfs(arr);
        int level = height(root)+1;
        for (int i =0; i <= level; i++){
            nth_order(root,i);
            System.out.println();
        }
    }
}
