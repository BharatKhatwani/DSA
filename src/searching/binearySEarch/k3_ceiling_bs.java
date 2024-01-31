package searching.binearySEarch;

public class k3_ceiling_bs {
    public static void main(String[] args) {
        int [] arr = {1,5,7,9,15,20,28,38,45,56,75};
        int target = 8;
        System.out.println(search(arr,target));
    }
static int search(int [] arr, int target){
        int start =0;
        int end = arr.length -1;

    // but what if the target is greater than the greatest number in the array
    if (target > arr[arr.length - 1]) {
        return -1;
    }
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid +1;
            }
            else if (target<arr[mid]) {
                end = mid -1;
            }
            else {
                return mid ;
            }
        }
        return start;
}
}


/*
in the question there have been difficult to find the next greather element all the other things are same to bineary search question
 */