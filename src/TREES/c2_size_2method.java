package TREES;

public class c2_size_2method {
    public static class Node {
            int val ;  // initially 0
        Node left;  // initially null
          Node right ;  // initially null

            public Node(int val) {
                this.val = val;
            }
        }


        public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
        }





        public static int max (Node root){
            if (root == null){
                return Integer.MIN_VALUE;   // for negative value we return min value
            }
            int a = root.val;
            int b= max(root.left);
            int c = max(root.right);
            return Math.max (a,Math.max (b,c));
        }


        public static int size (Node root){
        if (root == null){
           return 0;
        }
        return 1+ size (root.left) + size (root.right);
        }





    public static int sum (Node root){
        if (root == null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }




    public static void main(String[] args) {
        Node root = new Node (-2);
        Node a = new Node (-4);
        Node b = new Node (-10);
root.left = a;
root.right = b;
Node c = new Node (-6);
Node d = new Node (-45);
a.left = c;
a.right = d ;

Node e = new Node (-11);  // for one value are printing in it
b.right = e ;
//e.left = f;

//        System.out.println(size(root));
//        System.out.println(sum(root));
//        System.out.println(max(root));
        System.out.println(height(root));
    }


}


