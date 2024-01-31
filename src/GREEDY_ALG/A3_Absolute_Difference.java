package GREEDY_ALG;
import java.util.*;
public class A3_Absolute_Difference {  // o(n)logn
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int[] B = {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);

        int mindiff =0;
        for (int i =0 ; i<A.length; i++){
            mindiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute diff of pairs =" + mindiff);
    }
}
