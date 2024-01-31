package QUEUE;
import java.util.*;
public class c6_deque {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        // add , remove , poll , element
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getLast());
//        System.out.println(dq.getFirst());

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
                dq.add(5);       // last add

        System.out.println(dq);
dq.remove();         // first remove
        dq.removeAll(dq);
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
    }
}
