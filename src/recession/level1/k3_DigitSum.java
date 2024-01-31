package recession.level1;

public class k3_DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

   static int sum(int n){

        if (n==1){
            return 1;
        }
return sum(n/10) + n%10;
    }
}