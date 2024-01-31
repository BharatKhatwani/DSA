package Stacks;

import java.util.Stack;

public class C3_insertion_AT_stack {
    public static void main(String[] args) {
        // insert at the block and the index !!
        Stack<Integer> st = new Stack<>();
        st.push (1);
        st.push (2);
        st.push (3);
        st.push (4);
        st.push (5);
        System.out.println(st);
int idx = 2;
int x = 7;
        Stack<Integer> temp  = new Stack<>();
while(st.size() > idx ){
    temp.push(st.pop());              // push = daalna and // pop = delete krna hota ha
}
        System.out.println(temp);

st.push(x);
        System.out.println(x);
while(temp.size() >0){
    st.push(temp.pop());
}
        System.out.println(st);
    }
}
