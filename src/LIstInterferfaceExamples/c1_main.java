package LIstInterferfaceExamples;
import java.util.*;
public class c1_main {
    public static void main(String[] args) {
ArrayListExample();
StackExamples();
    }
    static void ArrayListExample(){
//ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
l.add(1);
l.add(2);
l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // 1 - based indexing => 2
        l.set(1,10);  // modify at index 1
        System.out.println(l);     // 1 , 10 ,3
        System.out.println(l.contains(10)); // true

    }

    static void StackExamples (){
Stack <String >st = new Stack<>();
st.push("pw");
st.push("skills");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
