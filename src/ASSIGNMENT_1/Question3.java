package ASSIGNMENT_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {




//   int result = ((((x+8)/3)%5)*5);
//        System.out.println(result);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//         x = x+y;
//        y = x-y;
//        x= x-y;
//        System.out.println(x);
//        System.out.println(y);



//        int x = sc.nextInt();
//        int sum= 0;
//        while (x>0){
//            sum += x%10;
//            x/= 10;
//        }
//        System.out.println(sum);

        //  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//int sum =0;
//
//while (true){
//    int x=sc.nextInt() ;
//    if (x ==0){
//        break;
//    }
//    sum +=x;
//}
//        System.out.println("The sum will be "+sum);


        //Take integer inputs till the user enters 0 and print the largest number from all.
//        int max = Integer.MIN_VALUE;
//        int x;
//        while (true){
//             x = sc.nextInt();
//            if (x ==0){
//                break;
//            }
//            if (x >max){
//                max =x;
//            }
//
//        }
//if (max == Integer.MIN_VALUE){
//    System.out.println("your are not enter the valid number ");
//}
//else {
//    System.out.println("THE Maximum number will be become are " +max);
//}


//        calculated the electrical bill
      //  Bill Amount = Energy Consumed * Rate per Unit
                Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the energy consumed are ");
//       int Energy_Consumed = sc.nextInt();
//        System.out.println("Enter the unit rate will be ");
//       int Rate_per_unit  = sc.nextInt();
//
//       int Bill_Amount = Energy_Consumed*Rate_per_unit;
//        System.out.println("The bill amout will be "+Bill_Amount);

        System.out.println("ENter the value of base will be ");
        double base = sc.nextDouble();
        System.out.println("Enter the value of exponent will be ");
        double exponent = sc.nextDouble();
       double power = Math.pow(base,exponent);
        System.out.println(base +"to power are" + " "+exponent + "result will be "+ " " +power);
    }
}
//Commission Percentage = (Commission Earned / Total Sales) * 100