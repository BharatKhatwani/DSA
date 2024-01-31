package linkedlist;

public class c2_implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;

        }

void insertAtHead(int val){
            Node temp = new Node(val);
            if (head == null){     // empty list
                head = null;
                tail = null;
            }
            else {
                temp.next = head;
                head = temp;
            }
}
void insertAt(int idx ,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){                // index ko auat ke bahr beja rha hu hum dekhan hoga
                insertAtEnd(val);
                return;
            }
            else if(idx ==0){
                insertAtHead(val);
                return ;
            }
            else if(idx<0|| idx >size()){
                System.out.println("wrond idx");
                return;
            }
    for(int i=1; i <= idx -1; i++){
                temp = temp.next;
            }
t.next = temp.next;
            temp.next =t;
}

void delete(int idx) {
    Node temp = head;
    if (idx == size() - 1) {
        tail = temp;
        return ;
    }
    else if(idx ==0){
        head = head.next;
        return;
    }
    for (int i = 1; i <= idx - 1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;

}









int getAt(int idx){
            Node temp = head ;
    if(idx<0|| idx >size()){
        System.out.println("wrond idx");
        return -1;
    }
            for(int i=1; i<= idx; i++){
                temp = temp.next;
            }
            return temp.data;
}
    }


        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.insertAtEnd(4);
            ll.display();
            ll.insertAtEnd(5);
            ll.display(); // output: 4 ->5
            ll.insertAtEnd(12);
            ll.display(); // 4->5->12
            ll.size();
//            System.out.println(ll.size());
            ll.insertAtHead(13); // 13->4->5->12
            ll.display();
            ll.insertAt(2,10);
            ll.display();

            ll.delete(4);
ll.display();
            ll.insertAt(0,100);
            System.out.println(ll.getAt(3));
        }
    }

