package searching.problem;

import java.util.Arrays;

public class k1_bs1 {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
    int[] ans = twoSum(numbers,9);
        System.out.println(Arrays.toString(ans));
    }

        public static int[] twoSum(int[] numbers, int target) {

            int left = 0;
            int right  = numbers.length-1;
            while (left <right ){
                int current = numbers[left] + numbers[right];
                if (current ==target){
                    return new int[] {left+1 , right +1};
                }
                else  if (current < target ){
                    left++;
                }
                else {
                    right --;
                }

            }

            return new int[0];


        }

    }


