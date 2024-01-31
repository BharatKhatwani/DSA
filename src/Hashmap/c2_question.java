package Hashmap;
import java.util.*;
public class c2_question {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 1, 4, 4, 6, 4, 4, 4, 6, 2, 2};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map ");

        System.out.println(freq.entrySet());
        int mxFreq = 0, ansKey = -1;
        // for traveling for the entry set
//        for (var e : freq.entrySet()) {
//            if (e.getValue() > mxFreq) {
//                mxFreq = e.getValue();
//                ansKey = e.getKey();
//            }
//        }
        /*
        total time compl are o(n) but in the case of arr the tc are increasing
        due to sorting the array then we are searing that  

        */
        for(var key : freq.keySet()){
           if(freq.get(key) > mxFreq){
               mxFreq = freq.get(key);
               ansKey = key ;

           }
        }
        System.out.printf("%d has max frequency and it occurs %d times ",ansKey,mxFreq);
    }
}