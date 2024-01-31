package searching.linear_Search;

import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 56, 85, 69, 36};
        int target= 23;
        System.out.print(linearSearch3(nums,target));
    }
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    public  static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        int index =0;
        while (index<arr.length){
            int element= arr[index];
            if (element == target){
                return index;
            }
            index++;
        }
        return -1;
    }
    static boolean linearSearch3(int[] arr , int target){
        if (arr.length ==0){
            return false;
        }
        int index=0;
        while (index<arr.length){
            int element =arr[index];
            if (element == target ){
                return true;
            }
        }
        return false;
    }
}