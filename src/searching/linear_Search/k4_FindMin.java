package searching.linear_Search;

public class k4_FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        int result =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >ans) {
                ans = arr[i];
                result =i;
            }
        }
        return result;
    }


}