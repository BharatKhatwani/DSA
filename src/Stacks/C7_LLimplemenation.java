package Stacks;

public class C7_LLimplemenation {
    public static void main(String[] args) {


        LLStack st = new LLStack();
        st.push(4);
        st.display();  //4
        st.push(5);
        st.display(); // 4 5
        st.push(1);

        st.display();        //  4 5 1
        System.out.println(st.size());       // 3

        st.pop();

        st.display();   // 4 5
        System.out.println(st.size());  // 2
        st.push(7);
        st.push(0);

    }


    public static class Node {   // user defined data types
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }


    public static class LLStack {   // user defined data structure
        Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
void displayrec (Node h){
            if (h== null) {
                return ;
            }
            displayrec(h.next);
    System.out.print(head.val + " ");
}
void display(){
            displayrec(head);
    System.out.println();
}
        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        int size() {
            return size;

        }

        int pop() {
            if (head == null) {
                System.out.println("Stack isEmpty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack isEmpty");
                return -1;
            }
            return head.val;
        }
    }
}