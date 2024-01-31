package MATHS.bit;

public class k3_magicNumber {
    public static void main(String[] args) {
        int ans =0;
        int base =2;
     int   n =4;
     while (n>0){
          int last = n&1;
          n = n>>1;
          ans += last * base;
          base = base * 2;

     }
        System.out.println(ans);

    }
}
