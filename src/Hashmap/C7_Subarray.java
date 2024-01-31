package Hashmap;

import java.util.HashMap;

public class C7_Subarray {
    int ZeroSumLargestSubarray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, prefsum = 0;
        mp.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
prefsum+= arr[i];
if(mp.containsKey(prefsum)){
    maxLen = Math.max(maxLen,i -mp.get(prefsum) );
}else {
    mp.put(prefsum,i );
}
        }
        return maxLen ;
    }
}