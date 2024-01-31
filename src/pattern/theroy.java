package pattern;

public class theroy {
    public static void main(String[] args) {
        /*
        1.for the outer loop count the no. of lines
        2. for the inner loop,focus on the column and connect them somehow to the row
        3.print them '*' inside the inner the loop
        4.(option) observe symmetry
        */
//         for(int i=0; i <4 ;i++){
//             for (int j=0; j<4 ;j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }

//
//        for(int i=5; i >0 ;i--){
//            for (int j=0; j<=i;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=5 ;i++){
//            for (int j=1;j<=i;j++ ){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        for (int i=5; i>=1;i--){
//            for (int j=1;j<=i;j++ ){
//                System.out.print(j + " ");
//            }
//            System.out.println();


        // }

        // p7
//        for (int i = 0; i < 5; i++) {
//            // for space
//            for (int j = 0; j < 5 - i - 1; j++) {
//                System.out.print("-");
//            }
//            // for star
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//
//
//            // for space
//            for (int j = 0; j < 5 - i - 1; j++) {
//// for star
//                System.out.print("-");
//            }
//
//            System.out.println();
//        }
        /** ----*----     * ----*----
---***---
--*****--
-*******-
*********
*/



        for (int i = 0; i < 5; i++) {
            // for space
            for (int j = 0; j <i; j++) {
                System.out.print("-");
            }
              for (int j = 0; j < 2*5 -(2*i+1); j++) {
                            System.out.print("*");
                        }
            //for star


            // for space
            for (int j = 0; j <  i ; j++) {
// for star
                System.out.print("-");
            }

            System.out.println();
        }
}
}
