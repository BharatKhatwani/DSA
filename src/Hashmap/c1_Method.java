package Hashmap;
import java.util.*;
public class c1_Method {
    public static void main(String[] args) {
        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // Adding element
       mp.put("Akash" , 21);
        mp.put("Yash" , 16);
        mp.put("Lav" , 17);
        mp.put("Rishika" , 19);
        mp.put("Harry" , 18);


// Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // get you are entre the name of it
        System.out.println(mp.get("Rahul")); // null

        // Changing /updating value of the hashmap
        mp.put("Akash" , 25);     // Akash -> 25
        System.out.println(mp.get("Akash"));

// Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("riya"));  // null

        // checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash"));  // false
        System.out.println(mp.containsKey("Yash"));  // true

        // Adding a new entry only if the key Doesn't exist already
        mp.putIfAbsent("Yashika" , 30);   // will entre
        mp.putIfAbsent("Yash", 30);   // will not enter

        // Get all  keys in the Hashmap
        System.out.println(mp.keySet());

        // Get all value in the Hashmap
        System.out.println(mp.values());

        // Get all enteries in the Hashmap
        System.out.println(mp.entrySet());

        // Traversing all entries of Hashmap - multiple methods
        // different type of for loop are  used
for (String key : mp.keySet()){
    System.out.printf("Age of %s is %d\n" ,key ,mp.get(key));
}

        System.out.println();
for (Map.Entry <String , Integer> e  : mp.entrySet())  {
    System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
}
        System.out.println();
for (var e : mp.entrySet()){
    System.out.printf("Age is %s is %d\n", e.getKey(),e.getValue());
}
    }
}
