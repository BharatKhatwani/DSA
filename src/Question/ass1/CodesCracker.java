package Question.ass1;

import java.util.Scanner;

public class CodesCracker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


//         System.out.println("Enter the value of n are ");
//         int n = sc.nextInt();
//         System.out.println("Enter the value of r are ");
//         int r = sc.nextInt();
//         int ncr = fact(n) / (fact(r) * fact(n - r));
//         System.out.println("ncr" + " = " + ncr);
//      }
//      static int fact ( int num){
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//            fact *= i;
//
//         }
//         return fact;


      System.out.println("Enter the value of n are ");
      int n = sc.nextInt();
      System.out.println("Enter the value of r are ");
      int r = sc.nextInt();
      int npr = fact(n) /(fact(n-r));
      System.out.println("npr" + " = " + npr);
   }

   static int fact(int num) {
      int fact = 1;
      for (int i = 1; i <= num; i++) {
         fact *= i;

      }
      return fact;

   }
}

