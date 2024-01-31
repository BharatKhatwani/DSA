package linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The Kth missing number is: " + result);

    }

    public static int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Calculate the number of missing integers up to arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // At this point, left == right and contains the number of missing integers up to arr[left]
        // So, the Kth missing number is arr[left-1] + k - missing
        return left + k;
    }
}


