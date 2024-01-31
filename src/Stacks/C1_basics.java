package Stacks;

//import java.util.ArrayList;

//import java.util.Stack;
import java.util.*;

public class C1_basics {
    public static void main(String[] args) {
   //     int[] arr = new int[5];
      //  ArrayList <Integer> arr = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push (9);
        st.push (10);
        // peek :- return the top most value in the stack
        System.out.println(st.peek());
        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st);
//        st.empty();
        System.out.println(st);
        System.out.println("size is :"+ st.size());
        System.out.println(st.isEmpty()); // it is not that boolean return in it so that we can acces that

       while (st.size() >2){
           st.pop();
       }
        System.out.println(st.peek());
     }
}
