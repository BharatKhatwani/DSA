package QUEUE.Question;
import java.util.*;
public class c2_question {
 ;


        public static Stack<Integer> reverseKElements(Stack<Integer> stack, int k) {
            if (k <= 0 || k > stack.size()) {
                return stack; // No reversal needed if k is invalid or stack is empty
            }

            Stack<Integer> auxStack = new Stack<>();

            // Step 1: Pop k elements from the original stack and push them onto auxStack
            for (int i = 0; i < k; i++) {
                auxStack.push(stack.pop());
            }

            // Step 2: Pop elements from auxStack and push them back onto the original stack
            while (!auxStack.empty()) {
                stack.push(auxStack.pop());
            }

            return stack;
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            int k = 3;

            System.out.println("Original Stack: " + stack);
            Stack<Integer> reversedStack = reverseKElements(stack, k);
            System.out.println("Reversed Stack (top " + k + " elements): " + reversedStack);
        }
    }


