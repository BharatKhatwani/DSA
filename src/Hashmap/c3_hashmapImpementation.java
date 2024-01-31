package Hashmap;

import java.util.LinkedList;
// code base are correct  run on online complier
public class c3_hashmapImpementation {

static class MyHashMap<K, V> {
    public static final int DEFAULT_CAPACITY = 4;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n; // the number of entries in the map
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    private void initBuckets(int capacity) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private void rehash (){
        // first we are saving the old bucket array
        LinkedList<Node>[] oldBuckets = buckets;
        initBuckets(oldBuckets.length*2);
        n=0;
        // we are pointing the data of old bracket to new brackets
        for (var bucket : oldBuckets){
            for (var node : bucket){
                put (node.key , node.value );
            }
        }
    }

    public int size() { // return the number of entries in the map
        return n;
    }

    public MyHashMap() {
        initBuckets(DEFAULT_CAPACITY);
    }
public int  capacity (){
       return buckets.length ;
}
public float load(){
        return (n*1.0f) / buckets.length;
}
    private int hashFunc(K key) {
        int hc = key.hashCode();
        return (Math.abs(hc)) % buckets.length;
    }

    // Traverses the linked list and looks for a node with the given key, if found, it returns its index
    // otherwise, it returns -1
    private int searchInBucket(LinkedList<Node> ll, K key) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value) { // insert / update
        int bi = hashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket, key);

        if (ei != -1) { // key already exists, update its value
            Node currNode = currBucket.get(ei);
            currNode.value = value;
        } else { // key doesn't exist, insert a new node
            Node newNode = new Node(key, value);
            currBucket.add(newNode);
            n++;
        }
        // we are doing due to rehashing the factor in it

        if (n>= buckets.length  * DEFAULT_LOAD_FACTOR){
            rehash();
        }
    }

    public V get(K key) {
        int bi = hashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket, key);

        if (ei != -1) { // key exists
            Node currNode = currBucket.get(ei);
            return currNode.value;
        }

        return null; // key doesn't exist
    }

    public V remove(K key) {
        int bi = hashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket, key);

        if (ei != -1) { // key exists
            Node currNode = currBucket.get(ei);
            V val = currNode.value;
            currBucket.remove(ei);
            n--;
            return val;
        }

        return null; // key doesn't exist
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
mp.put("d " , 4);
mp.put("e" , 5);
mp.put("f" , 6 );
        System.out.println(mp.get("One"));    // Output: 1
        System.out.println(mp.get("Two"));    // Output: 2
        System.out.println(mp.get("Three"));  // Output: 3

        mp.remove("Two");
        System.out.println(mp.get("Two"));    // Output: null
        System.out.println("CAPACITY" + mp.capacity() );
        System.out.println("LOAD " + mp.load ());
    }
}
}