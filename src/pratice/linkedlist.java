package pratice;


public class linkedlist {
    public static class Node {
        int data ;
        Node next ;
        Node (int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node (23);
        Node b = new Node (53);
        Node c =new Node (90);
        Node d = new Node (100);
        a.next = b ;
        b.next = c;
        c.next = d;
//        System.out.print(a.data  +  " ");
//        System.out.print(b.data + " ");
//        System.out.print(c.data + " ");
//        System.out.print(d.data + " ");
        display(a);

    }
    public static void display(Node head){
        if(head == null){
            return ;
        }
        while (head != null){
            System.out.println(head.data);
            head = head.next;


        }
    }
}
