package Stacks.vedio3;

import java.util.Stack;

public class c8_posttoIn {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i =0 ; i<str.length(); i++){
            char ch = str.charAt(i);

            // it is number or not check by ascii value method

            int ascii = (int ) ch ;
            if (ascii >=48 && ascii <=57){
                val.push(ch +"");
            }
            else {
              String v2 = val.pop();
               String v1 = val.pop();
                char op = ch ;
                // infix :- v1 o v2
                String t = "("+v1 + op + v2+ ")" ;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
