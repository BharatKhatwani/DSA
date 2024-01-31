package QUEUE;

import java.util.LinkedList;
import java.util.*;

public class C1_BASICS {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();   // remove and poll are same thing
        System.out.println(q);
       // System.out.println(q.peek());     // peek and element are same thing
        System.out.println(q.size());
    }

}
