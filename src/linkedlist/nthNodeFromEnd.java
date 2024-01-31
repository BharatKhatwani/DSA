package linkedlist;

public class nthNodeFromEnd {
    public static Node nthNode(Node head, int n) {

        int size = 0;
        Node temp = head;                // first we can calculated size of the linkedlist
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n > size) {
            return null;
        }

        int m = size - n;
        //Mth for start
        temp = head;
        for (int i = 1; i <= m; i++) {    // in the reverse order
            temp = temp.next;
        }

        return temp;
    }

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;


    }
// q3 // in the case left wala middle hua to

    public static Node deteteNodenthForEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;

        }
        if (fast == null){           // FOR DELETING HEAD node
            head = head .next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
       slow.next = slow.next.next;
        return head;
    }

public static void display(Node head ){
        Node temp =head;

        while (temp != null){
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
    System.out.println();
}
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100 13 4 5 12 10
        Node q = nthNode2(a, 5); // last se value aaya
      System.out.println(q.data);



//display(a);
//a = deteteNodenthForEnd(a,6 );  // for the end 2 value delete hogi
//display(a);
    }
}
