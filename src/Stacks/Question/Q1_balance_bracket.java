package Stacks.Question;

import java.util.Scanner;
import java.util.Stack;

public class Q1_balance_bracket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }


    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {    // in the stack bracket are will be empty
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0) {
                    return false;
                }
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
