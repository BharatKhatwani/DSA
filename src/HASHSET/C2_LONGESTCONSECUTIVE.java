package HASHSET;

import java.util.HashSet;



    public class C2_LONGESTCONSECUTIVE {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> st = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                st.add(num);
            }

            int maxStreak = 0;
            for (int num : st) {
                if (!st.contains(num - 1)) {  // num is starting point of the sequence
                    int currentNum = num;
                    int currStreak = 1;  // length of current consecutive sequence
                    while (st.contains(currentNum + 1)) {
                        currStreak++;
                        currentNum++;
                    }
                    maxStreak = Math.max(maxStreak, currStreak);
                }
            }
            return maxStreak;
        }

        public static void main(String[] args) {
            C2_LONGESTCONSECUTIVE c2 = new C2_LONGESTCONSECUTIVE();
            int[] nums = {1, 9, 3, 10, 4, 20, 2};
            int maxLength = c2.longestConsecutive(nums);
            System.out.println("The length of the longest consecutive sequence is: " + maxLength);
        }
    }
