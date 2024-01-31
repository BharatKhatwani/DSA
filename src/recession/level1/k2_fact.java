package recession.level1;

public class k2_fact {
    public static void main(String[] args) {
int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<=1){
            return 1;
        }
        return n* fibo(n-1);
    }
}
