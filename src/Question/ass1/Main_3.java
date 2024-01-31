package Question.ass1;
import java.util.*;
public class Main_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


      //  Input a number and print all the factors of that number (use loops).

//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//        for(int i =1; i<=n ;i++){
//            if(n %i ==0){
//                System.out.print( i +  " ");
//            }
//        }

      //  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        System.out.println("Enter the number in it");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result  =0 ;
        char op = sc.next().trim().charAt(0);
        while(true){
          if (op =='+'){
               result = num1+num2;

          }
       else   if (op == 0){
              break ;
          }
       else {
              System.out.println("Invalid operator");
          }
            System.out.println(result);

        }



    }
}
