package arrays;

import java.util.Arrays;

public class k3_PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(nums);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
   public  static void change(int[] arr) {
        arr[0] = 99;
    }
}