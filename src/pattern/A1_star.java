package pattern;

public class A1_star {
    public static void main(String[] args) {
for(int line =1; line <=10; line++){
    for(int star =1 ; star <= line ; star++){
        System.out.print("*");

    }
    System.out.println();
}
        int n =4;
char ch = 'A';
        // inverted star pattern
//        for (int line =1; line <=n ; line ++){
//            for (int star = 1 ;star <=n-line+1 ; star++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

//        for(int line =1; line <=n; line++){
//            for(int number =1; number <=line ; number++){
//                System.out.print(number + " ");
//            }
//            System.out.println();
//        }



// Character print
        for (int line = 1 ; line <=n ; line ++ ){
           // inner loop
          for (int chars =1 ; chars <=line ; chars++  ){
              System.out.print(ch);
              ch ++;
          }
            System.out.println();
        }



    }
}
