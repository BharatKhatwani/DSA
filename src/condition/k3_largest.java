package condition;

import java.util.Scanner;

public class k3_largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        // Q .. is the find the largest of these three number
//       int max = a;
//       if (b > max ){
//           max =b;
//       }
//       if ( c > max){
//           max = c;
//       }
//
//
        int max = 0;
        if (a > b){
            max = a;

        }
        else {
            max = b;
        }
        if ( c > max){
            max =c ;
        }
     System.out.println(max);
    }
}
