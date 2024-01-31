package pattern;

public class Advance_2 {
    static void hollow_rectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            // inner-column
            for (int j = 1; j <= totcols; j++) {
                // cell -(i,j)
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printInvertedHalfPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
static void FloysTriangle(int rows){
        int num =1 ;
        for (int i =1 ; i<= rows; i++){
            for (int j =1; j<= i ; j++){
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }
}
static void Zero_one_pattern(int rows){
        for (int i =1 ; i <= rows; i++){
            for (int j =1 ; j <= i ; j++){
                if((i + j ) %2 ==0){
                    System.out.print("0" + " ");
                }else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
}
static void ButterFly (int n){
    // 1 half
    for (int i =1; i<=n ; i++){
        // stars - i
for(int j =1 ; j <=i; j++){
    System.out.print("*");
}
 // space - 2*(n-i)
for (int j =1 ; j<=2*(n-i); j++){
    System.out.print(" ");
}
        // stars - i
        for (int j =1 ; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    // 2nd Half
    for(int i =n ; i>=1 ; i--){
        // stars - i
        for(int j =1 ; j <=i; j++){
            System.out.print("*");
        }
        // space - 2*(n-i)
        for (int j =1 ; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        // stars - i
        for (int j =1 ; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static void solid_rhombus(int n){
      for(int i =1 ; i<=n ; i++){
        // spaces
          for(int j =1 ; j <=n-i; j++){
              System.out.print (" ");
          }
          // star
          for (int j =1; j<=n; j++){
              System.out.print("*");
          }
          System.out.println();
      }

}
static void hollow_rhombus(int n){
        for(int i =1; i<=n ; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            // hollow rectangle
            for (int j =1; j<=n ; j++){
                if(i ==1 || i ==n || j==1 || j ==n ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
static void diamond (int n) {
    // 1st half
    for (int i = 1; i <= n; i++) {
        // spaces
        for (int j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // 2nd half
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
  //      hollow_rectangle(4, 4);
       // printInvertedHalfPyramid(4);
       // FloysTriangle(4);
     //   Zero_one_pattern(4);
        //ButterFly(10);
       // solid_rhombus(7);
      // hollow_rhombus(5);
        diamond(7);
    }
}
