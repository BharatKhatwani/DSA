package searching.binearySEarch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,63,85,96};
        int target = 63;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            /*
            mid value and array are start and end array size will reduced
            start = mid +1;
            end = mid -1;
            break down into smaller step

            for the formula of  middle element we are taking index value of it not a number in it
            
             */



            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Element found, return its index
            }
        }

        return -1; // Element not found in the array
    }
}

