package Hashmap;
import java.util.*;

public class TwoSum {
    public int[] twosum (int[] nums , int target){
        int n = nums.length;
        int [] ans = {-1};
// value , index
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i =0; i<n ; i++){

int partner = nums [i];

if (mp.containsKey(partner)){
ans = new int[]{i, mp.get(partner)};
return ans ;
}
mp.put(nums[i] , i);



//        for(int i =0 ; i<n; i++){
//           for (int j = i+1; j <n ; j++){
//               if (nums [j] == target - nums[i]){
//                   ans = new int[]{i ,j};
//                   return ans ;
               }


        return ans ;
    }
}
