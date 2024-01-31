package searching.binearySEarch;

public class k2_orderAgnosis {
    public static void main(String[] args) {
        int [] nums = {99,89,79,69,59,49,39,29,19,9};
        int target = 59;
        System.out.println( Search(nums,target));

    }
    static int Search(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isASC = arr[start] <=arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;  // you are calcuated by the index of the array

            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
