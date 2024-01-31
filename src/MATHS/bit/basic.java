package MATHS.bit;

public class basic {
    public static void main(String[] args) {

        // you need to treat n as an unsigned value
        System.out.print(hammingWeight(000000101001));
    }

    public static  int hammingWeight(long n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if the last bit is 1
            n = n >>> 1; // Shift n to the right by 1 bit
        }
        return count;
    }
    }
