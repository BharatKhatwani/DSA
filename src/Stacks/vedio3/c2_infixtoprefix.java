package Stacks.vedio3;
import java.util.Stack;

public class c2_infixtoprefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";   // 9-8 *4  /6 == 9-32/6 == 9 -5 == 4

        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // 0 to 9
                String s = "" + ch;
                val.push(s);
            } else if (op.empty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();    // '(' removed
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        while (!op.empty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        String prefix = val.pop();
        System.out.println(prefix);
    }
}
