package loops;
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int ar[] = { 10, 2, 3, 4, 5 };
        int result = 1;
        for (int i =0; i <ar.length-1;i++){
            result = result*ar[i+1];
        }
        System.out.println(result);
    }

}
