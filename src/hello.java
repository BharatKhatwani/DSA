
import java.util.*;
import java.util.*;




public class hello {

    public static void main(String[] args) {
        System.out.println(recusion(5));
    }

    private static int recusion(int i) {
       if (i==1){
           return 1 ;
       }
       return i * recusion(i-1);
    }
}