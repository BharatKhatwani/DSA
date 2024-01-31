package HASHSET;

import java.util.Arrays;
import java.util.HashSet;

public class lc {
    public static void main(String[] args) {
        int nums1[]= {1,2,1,2};
        int nums2[] = {2,2};
        
        Arrays.sort(nums1);
        HashSet<Integer> num = new HashSet<>();
        for (int i =0; i <nums1.length;i++) {
            num.add( nums1[i]);
        }
        for (int j=0; j<nums2.length ;j++){
            if (num.contains(nums2[j]))
            System.out.println(num);
        }
        System.out.println(num);
    }
}
