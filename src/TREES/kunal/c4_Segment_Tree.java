package TREES.kunal;

public class c4_Segment_Tree {

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
c4_Segment_Tree tree = new c4_Segment_Tree(arr);

    }
   public static class Node {
        private int data;
        private Node left ;
        private Node right ;
        int startInterval;
        int endInterval;

       public Node(int startInterval, int endInterval){
           this.startInterval= startInterval;
           this.endInterval = endInterval;
       }


   }
    Node root;
    public c4_Segment_Tree(int [] arr ){
this.root = constructtree(arr,0,arr.length-1);
// in the making the of segment time complexity is O(n) after adjusting its value is O(logn)

    }
public Node constructtree(int[] arr , int start , int end){
        if (start  == end){
            Node leaf = new Node (start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start ,end);
        int mid = (start + end ) / 2;
        node.left= constructtree(arr , start , mid);
        node.right = constructtree(arr ,mid+1,end);
        node.data = node.left.data + node.right.data ;
        return node ;
}
public void display (){
display(root);
}
public void display (Node node ){
String str = "";
if (node.left != null){
    str = str + "Interval  = [" + node.left.startInterval + "-"  + node.left.endInterval + "]" + "and data :" + node.left.data + " +=> ";
}
else {
    str = str + "No Left child";
}

// for current node
    str = str + "Interval  = [" + node.startInterval + "-"  + node.endInterval + "]" + "and data :" + node.data + " +=> ";

// for right child
    if (node.right != null){
        str = str + "Interval  = [" + node.right.startInterval + "-"  + node.right.endInterval + "]" + "and data :" + node.right.data ;
    }
    else {
        str = str + "No Right child";
    }
    System.out.println(str + '\n');
    if (node.left != null) {
      display(node.left);
    }
    if (node.right != null){
        display(node.right);
    }
}

// private int query (Node root ,int qsi , int qei  ){
//
// }
}
