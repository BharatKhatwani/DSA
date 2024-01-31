package linearsearch;

public class k4_FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
   static int min(int nums[]){
        int ans = nums[0];
for (int i =0; i<nums.length;i++){
    if(nums[i] <ans){
        ans = nums[i];
    }
}
return ans;

    }


}