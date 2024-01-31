package linkedlist;



public class A1_main {
    public static void insertAtEnd (Node head ,int val){
Node temp = new Node (val);
Node t = head;
while(t.next != null){
     t = t.next;
}
t.next = temp;
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node x = new Node(5);
        Node a = new Node(3);
        //  System.out.println(a.next);
        Node b = new Node(6);
        Node c = new Node(1);
        Node d = new Node(100);

        Node e = new Node(456);
        //    System.out.println(x.data);
        // System.out.println(x.next);
        x.next = a;
        // System.out.println(a);
// if we can print the data of another than print that then
        //  System.out.println(a.data);
        //       5 ->3 6 1 2
        // for this all linkedlist is connected
        a.next = b;   //  5-> 3-> 6

        b.next = c;   // 5->3->6->1
        c.next = d;        // 5->3->6->1->2
        d.next = e;

//           System.out.println(a.next.data);
//       ////  there have been best address can be stored in a.next and b
//            System.out.println(a.next );//linkedlist.A1_main$Node@6acbcfc0
//            System.out.println(b);//linkedlist.A1_main$Node@6acbcfc0
//            System.out.println(c);


       //  displaying the linked list first way
         //not a good method

//            System.out.println(a.data);
//            System.out.println(b.data);
//            System.out.println(c.data);
//
//            System.out.println(a.next.data); // b . data
//            System.out.println(a.next.next.data); // c .data
//            System.out.println(a.next.next.next.data);

    ///     second method
            Node temp = x;
//            for (int i=1; i<=5 ; i++){
//                System.out.print(temp.data + " "); // important data
//                temp = temp.next;
//   }
//
//
//                Node temp =x;
//                while(temp!=null){
//                    System.out.print(temp.data + " ");
//                    temp= temp.next;
//     ///   display(x);
//        System.out.println();
//     //   display2(x);
//        System.out.println();
//       // displayreverse(x);
//        System.out.println();
//        System.out.println(length(x));
//        insertAtEnd(x,87);
//      //  display(x);
//                }

    }

    //     by the help of function
    public static void display(Node head){
        if (head == null) return ;
        Node temp = head ;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }    // with the help of recurrsion
    public static void display2(Node head) {
        if (head == null) {
            return;


        }

        System.out.print(head.data + " ");
        display2(head.next);
    }


    // by the help recurrsion we can call by it

    static void displayreverse(Node head) {
        if (head == null) {
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data + " ");

    }
      static int length (Node head){
        int count =0;
        if (head == null) return 0;
        while(head!= null) {
            count ++;
            head = head.next;
        }
        return count ;
      }
    }




