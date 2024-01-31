package linearsearch;

import java.util.Arrays;

public class k5_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22,56,75,89},
                {56,85,75,12},
                {23,45,46},
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}