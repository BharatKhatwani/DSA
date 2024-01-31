package Question.ass1;
import java.util.*;




public class Main_2 {
    public static void main(String[] args) {
        //  Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);

        //1
//        System.out.println("enter the value in it");
//int nums = sc.nextInt();
//if(nums % 2==0){
//    System.out.println("it is even number");
//
//}else{
//    System.out.println("its is not a even number");
//}

        //2  Take name as input and print a greeting message for that particular name
//        System.out.println("Enter the name of it");
//
//        String name = sc.nextLine();
//        System.out.println(name + " "+"it is great person" );

        //3  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
//        System.out.println("enter the value of principle");
//
//        int p = sc.nextInt();
//        System.out.println("enter the value of time");
//        int t = sc.nextInt();
//        System.out.println("Enter the value of r in it");
//        int r= sc.nextInt();
//        System.out.println("the value of si will become");
//     int SI  = (p * t *r) / 100;
//        System.out.println(SI);
//

        //4....  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        System.out.println("Enter the first value: ");
//        int n1 = sc.nextInt();
//
//        System.out.println("Enter the operator (+, -, /, *): ");
//        char operator = sc.next().charAt(0);
//
//        System.out.println("Enter the second value: ");
//        int n2 = sc.nextInt();
//
//        int result = 0;
//
//        if (operator == '+') {
//            result = n1 + n2;
//        } else if (operator == '-') {
//            result = n1 - n2;
//        } else if (operator == '*') {
//            result = n1 * n2;
//        } else if (operator == '/') {
//            if (n2 != 0) {
//                result = n1 / n2;
//            } else {
//                System.out.println("Cannot divide by zero.");
//                System.exit(0);
//            }
//        } else {
//            System.out.println("Invalid operator.");
//            System.exit(0);
//        }
//
//        System.out.println("Result: " + result);
//
//        sc.close();


        // Take 2 numbers as input and print the largest number.
//        System.out.println("enter the number one");
//        int a = sc.nextInt();
//        System.out.println("Enter the number second");
//        int b= sc.nextInt();
//        int max ;
//        if (a>b){
//            max = a;
//            System.out.println("a is the largest number in it : " +max);
//        }
//       else {
//            max = b;
//            System.out.println("b is the largest number to it :" +max);
//        }
//       if (a==b){
//            System.out.println("there  is no maximum value in it");
//        }

        // Input currency in rupees and output in USA.
//        System.out.println("Enter the indian rupees");
//        int rupees = sc.nextInt();
//        double UsA = rupees * 0.012;
//        System.out.println("The usa currency will be" + UsA);


        // print the fibonics series
//        System.out.println("Enter the value to print the number in fibonics series");
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        for (int i = 0; i <= n; i++) {
//
//
//            System.out.println(a);
//
//            int c =a+b;
//            a =b ;
//            b =c;

 // 8. To find out whether the given String is Palindrome or not.

      //  }
     //   9.To find out whether the given String is Palindrome or not.
//        String s = new String();
// s = sc.nextLine();
//        int i , j, flag ;
//        i =0;
//        j = s.length()-1;
//        flag =0;
//        while (i<j && flag ==0) {
//            if (s.charAt(i) != s.charAt(j)) {
//                flag = 1;
//
//            }
//            i++;
//            j--;
//
//        }
//        if(flag ==0) {
//            System.out.println("it is palindrome");
//        }else {
//            System.out.println("it is not a palindrome");
//        }

        //10. To find Armstrong Number between two given number.
        int num = sc.nextInt();
        int t1= num;
        int length = 0;
while (t1 !=0){
    length =length +1;
    t1= t1/10;
}
int t2 = num;
int arm =0;
while (t2!=0){
    int mul =1;
   int rem = t2%10;
    for(int i =1; i<= length ; i++){
        mul= mul *rem ;
    }
    arm= arm +mul;
    t2 = t2/10;

}
if (arm ==0){
    System.out.println(num + " is armstrong");
}
else {
    System.out.println(num + " " +  "is not armstrong number" );
}
    }
}








