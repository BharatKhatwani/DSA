package MATHS.bit;

public class k1_EvenODD {
    public static void main(String[] args) {
        System.out.println(isodd(68));
    }

    private static boolean isodd(int n) {
        return (n & 1) ==1 ;
    }

}
