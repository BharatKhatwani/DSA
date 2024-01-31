package searching.linear_Search;

import java.util.Arrays;

public class Search_In_2D {
    public static void main(String[] args) {
        int [][] nums = {{1, 2, 3, 4, 5, 56},
                {56, 25, 23, 45, 75},
                {31, 25, 46},
                {56, 23}
        };
        int target =46;
        int []ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][] , int target){

        for (int i =0; i <arr.length ; i++) {
            for (int j =0; j<arr[i].length ; j++) {
                if (arr[i][j] ==target ){
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1, -1};
    }
}
