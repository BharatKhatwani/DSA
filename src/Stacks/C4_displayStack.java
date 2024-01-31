package Stacks;

import java.util.Stack;

public class C4_displayStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displyreverserec(st);
        System.out.println();
//        displyrec(st);
//        System.out.println(st);
        reverse(st);
        System.out.println(st);

Stack<Integer>  rt = new Stack<>();
while(st.size()>0){

    rt.push(st.pop());
}
while(rt.size() > 0){
    int x = rt.pop();
    System.out.print(x + " ");
    st.push(x);
}

//


//int n = st.size();           //  reverse order me print hoga arr ka anadar
//        int[] arr = new int[st.size()];
//        for(int i =n-1; i>=0 ; i--){
//           int x = st.pop();
//           arr[i] = x;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // fir me 5 4 3 2 1 isko shi order me put kareg 1 2 3  4  5  print karega
//
//
//
//
//         for (int i=0; i<n; i++){
//
//             System.out.print(arr[i] + " ");
//st.push(arr[i]);
     //  }
    }
    // with the help of recussion how can we print it



    public static void displyreverserec (Stack<Integer> st){
        if (st.size() == 0){
            return ;
        }
 int top = st.pop();
        System.out.print(top + " ");
        displyreverserec(st);
        st.push(top);
    }
    public static void displyrec (Stack<Integer> st){
        if (st.size() == 0){
            return ;
        }
        int top = st.pop();
        displyrec(st);
        System.out.print(top + " ");

        st.push(top);
    }
    public static void reverse (Stack<Integer> st){
        if (st.size() ==1) {
            return ;
        }
        int top = st.pop();
        reverse(st);
      pushAtBottom(st,top);
    }

    private static void pushAtBottom(Stack<Integer> st, int x) {
        if(st.size() ==0){
            st.push(x);
            return;
        }
        int top = st.pop();
pushAtBottom(st,x);
st.push(top);
    }


}



