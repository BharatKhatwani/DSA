package linkedlist;

import javax.management.MBeanNotificationInfo;

public class practice {
   static  class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
       }
   }

    public static void main(String[] args) {
int a = 10;
int b = 0;
int c;
try {
     c = a/b;
    System.out.println("c ");
}
catch(ArithmeticException e){
    System.out.println("Answer is " + e);
}
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        a.next = b;

    }
    public void display(Node head){
        Node temp = head ;
        if (temp == null) return ;
        System.out.println(temp.data);
        temp = temp.next ;
    }
}
