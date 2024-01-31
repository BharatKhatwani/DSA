package Stacks.vedio3;

import java.util.Stack;

public class c6_pretopost {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i =str.length() -1; i>=0 ; i--) {
            char ch = str.charAt(i);

            // it is number or not check by ascii value method
            int ascii = (int) ch;
            if (ascii >=48 && ascii <=57){
                val.push(ch +  "");    // o nly change in the number instead of character
            }
            else {
                String v1 = val.pop();
                String v2 = val.pop();
         char op = ch;
         // v1 v2 o
                String t = v1 + v2 +op;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
