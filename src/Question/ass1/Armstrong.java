package Question.ass1;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  original_number,result=0 , reminder;
        int number =153;
        //number = sc.nextInt();
original_number=number;
while (original_number !=0){
    reminder= original_number%10;
    result += Math.pow(reminder,3);
    original_number /=10;
}
if (result ==number){
    System.out.println("It is a armstrong number" +number);
}
else{
    System.out.println("It is not a armstrong number" +" " + number);
}
    }
}