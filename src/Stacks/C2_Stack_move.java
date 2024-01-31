package Stacks;

import java.util.Stack;
import java.util.Scanner;
public class C2_Stack_move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        // for input
//        int n;
//        System.out.println("Enter the number of element when you can insert   ");
//n= sc.nextInt();
//        System.out.println("Enter the element   ");
//for (int i=1; i <=n; i++){
//  int x = sc.nextInt();
//  st.push(x);
//}
        st.push (1);
        st.push (2);
        st.push (3);
        st.push (4);
        st.push (5);
        System.out.println(st.peek());
        System.out.println(st);

        // reverse order
//        Stack <Integer > rt = new Stack<>();
//        while (st.size()>0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(rt);

        Stack<Integer> gt= new Stack<>();
        while (st.size () >0){
            gt.push(st.pop());
        }
        Stack <Integer> rt= new Stack<>();
        while (gt.size()>0){
rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
