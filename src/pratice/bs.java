package pratice;
import java.util.*;

class Person {
        int rollno;
        String name;

    void walk() {
        System.out.println( name + "there is hero here" );
        System.out.println(rollno + "there is it rollno");
    }
    void walk(int step){
        System.out.println(name + step + "are walked" );
    }
}
public class bs {
    public static void main(String[] args) {
        Person s1 = new Person();
        Person s2 = new Person();

s1.rollno = 15;
s2.rollno =35;
s1.name ="bharat";
s1.walk(56);
s2.walk();

    }
}














































//
////        Marks        Grade
////        91-100         AA
////        81-90          AB
////        71-80          BB
////        61-70          BC
////        51-60          CD
////        41-50          DD
////                <=40          Fail
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the marks");
//        int marks = sc.nextInt();
//        printing(marks);
//
//
//    }
//

//static void printing(int marks){
//        if (marks <100 && marks >=91){
//            System.out.println("AA");
//        }
//        if(marks<90 && marks >= 81){
//            System.out.println("AB");
//        }
//        if (marks < 80 && marks >= 71){
//            System.out.println("BB");
//        }
//    if (marks < 70 && marks >= 61){
//        System.out.println("BC");
//    }
//    if (marks < 60 && marks >= 51){
//        System.out.println("CD");
//    }
//    if (marks < 50 && marks >= 41){
//        System.out.println("DD");
//    }
//    if (marks <= 40){
//        System.out.println("Fail");
//    }
//
//}






























//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//
//
//    }
//
//    static int prime(int n) {
//        if (n <= 1) {
//            System.out.println("not prime and not composite function");
//        }
//        for (int c = 2; c <= n; c++) {
//
//            if (n % c == 0) {
//                System.out.println("not a prime number");
//
//            }
//            if (c * c < n) {
//                System.out.println("priome number");
//            }
//        }
//    }
//
//}

//` this number is prime or not



























        

        // sum
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first value");
//    int a = sc.nextInt();
//        System.out.println("enter the second value");
//        int b = sc.nextInt();
//        System.out.println("answer become be");
//        System.out.println( sum(a,b));
//
//    }
//    static int sum(int a,int b){
//        return a+b;
//    }
//























































    // voting or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        voting(age);
//    }
//    static void voting(int age){
//        if ( age >= 18){
//            System.out.println("your are elgible for voting");
//
//
//        }
//        else {
//            System.out.println("you are not giving the vote");
//        }
//    }



// number is even or odd
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the  value ");
//        int n = sc.nextInt();
//        evenorodd(n);
//
//    }
//        static void evenorodd(int n){
//
//            if (n == 0) {
//                System.out.println("it is even number");
//            }
//     else   if (n %2 ==0){
//            System.out.println("it is even number");
//        }
//        else{
//            System.out.println("it is a odd number");
//        }
//        }




    //    Write a Program to find the Maximum and Minimum of the Given Three Numbers.


//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the first value");
//        int a = sc.nextInt();
//        System.out.println("enter the second value");
//        int b = sc.nextInt();
//        System.out.println("enter the third value");
//       int c = sc.nextInt();
//        System.out.println("answer become");
//        System.out.println(main(a,b,c));
//        }
//        static int main(int a,int b,int c){
//        int max = a;
//        if(b > max){
//            return max = b;
//
//        }
//        if ( c > max){
//            return max = c;
//        }
//        return max ;
        //}



