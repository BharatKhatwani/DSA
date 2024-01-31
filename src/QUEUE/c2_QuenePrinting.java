package QUEUE;

import java.util.*;

public class c2_QuenePrinting {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // in the case of queue jo phle aayega vo hi phle jayega ........
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        while (q.size() >0 ){
            Queue<Integer> st = new LinkedList<>();
            while (q.size() >0 ){

                st .add(q.peek());
                q.remove();
            }
            System.out.println(st);
        }
    }
}
