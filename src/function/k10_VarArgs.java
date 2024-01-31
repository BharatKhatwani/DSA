package function;

import java.util.Arrays;

public class k10_VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo(2,3,4,5,65,75,8,9);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}