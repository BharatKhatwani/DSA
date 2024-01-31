package leetcode;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        String s = "Hello World";
        String str[] = s.split("\\s");

        System.out.print(Arrays.toString(str));
        System.out.println();
        System.out.println(str[str.length-1]);
    }
}
