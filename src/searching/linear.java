package searching;

public class linear {
    public static void main(String[] args) {
int [] nums = {52,23,25,67,89,28,13};
int target = 28;
        System.out.println(nums.length);
//        int ans = linearsearch(nums,target);
//        System.out.println(ans);
    }
    // search in the array: return the index if the item found
    // otherwise item not found return -1
    static int linearsearch(int[] arr, int target){
        if ( arr.length == 0){ // 0 mtlb false in java assume
            return -1;
        }
// run a ffor loop
      for (int index =0;index < arr.length; index++){
          // check for elemnt at  every index if it is = target
          int element = arr[index];
          if (element == target){
              return index;

          }
      }
// this line is excute if none of the return above have executed
        // hence the target not found
        return -1;
    }

}
