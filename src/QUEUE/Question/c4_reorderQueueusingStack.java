package QUEUE.Question;
import java.util.*;
public class c4_reorderQueueusingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);   // [1, 2, 3, 4, 5, 6, 7, 8]
Stack<Integer> st= new Stack<>();
for (int i =1 ; i <=4; i++){
    st.push(q.remove());
}   // remaining queue will be :- 5 6 7 8
while  (st.size() >0 ){
    q.add(st.pop());
}    //  now condition :--     5 6 7 8 4 3 2 1
// then step 4 will be
    for (int i =1 ; i<= 4; i++){
        st.push(q.remove());
    } // 4 3 2 1      top st for (int i =1 ; i<= q.size () / 2; ack ;- 8 7 6 5

    while (st.size () >0) {
           // one by one remove , phle stack se fir queue se
            q.add(st.pop());
            q.add(q.remove());
        }

        //  8 4 7 3 6 2 5 1
        // reverse the queue
        while (q.size ()>0){
         st.push(q.remove());
        }
        while (st.size () >0 ){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
