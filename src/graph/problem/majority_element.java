package graph.problem;
import java.util.*;
public class majority_element {  
    
    
    public int majorityElement(int[] nums) {  // brute force approx o(n^2)
        
for (int i =0 ; i <nums.length ; i++) {
    int count = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
            count++;
        }
    }
    if (count >nums.length){
        return nums[i];
    }
}
return 0;
}








    // majority element therom  T.C  = o (n) best solution
  /*  public int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote= 1;
        for (int i = 0; i < nums.length; i++) {


 if (vote ==0){
    vote++;
    majority=nums[i];
            }
          else  if (majority== nums[i+1]){
                vote++;

            }else {
              vote--;
 }
        }
        return majority;
     }
*/
    public static void main(String[] args) {

    }
}
