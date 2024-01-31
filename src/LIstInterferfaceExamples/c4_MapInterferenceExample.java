package LIstInterferfaceExamples;
import java .util.*;
public class c4_MapInterferenceExample {
    public static void main(String[] args) {
        HashMap <Integer,String> mp = new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Bharat");
        mp.put(2,"chetan");
        // Iterating over keys in a map
        for (Integer i : mp.keySet()){
            System.out.println(i);
        } // var for string and integer
        for (var e :mp.entrySet()){
            System.out.println(e.getKey());
        }
    //    mp.put(1,"hello");
//        mp.putIfAbsent(1,"hello");
//        System.out.println(mp);    // over-rides

        System.out.println(mp.entrySet());
//        System.out.println(mp.get(2)); // chetan
//        System.out.println(mp.containsKey(4));
//        System.out.println(mp.containsValue("Bharat"));
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
    }
}
