package HASHSET;
import java.util.*;

public class C1_MAIN {
    public static void main(String[] args) {
HashSet<String> st = new HashSet<>();
st.add("James");
        st.add("James");
        st.add("them");
        st.add("HEllo");
        st.add("James");
        System.out.println(st);
        System.out.println(st.contains("James"));
        System.out.println(st.size());
        st.remove("James");
    }
}
