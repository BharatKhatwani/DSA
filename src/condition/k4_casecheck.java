package condition;

import java.util.Scanner;

public class k4_casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        char ch = in.next().trim().charAt(0); // talking the input for the user so that trim is removing the extra space for string

        if (ch >= 'a'&& ch <= 'z'){
            System.out.println(" it is lower case");
        }
    else    if (ch >='A' && ch <= 'Z'){
            System.out.println("it is upper case");
        }
        else {
            System.out.println("invalid entry");
        }
        //System.out.println(ch);
    }
}
