package recession;

public class k4_Fibo {
    public static void main(String[] args) {
        double ans = fibo(15);
        System.out.println(ans);
    }
static int fibo(int n){
        if (n <2 ){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
}
}