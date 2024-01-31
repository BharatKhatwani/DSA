package College;

import java.io.FileOutputStream;
import java.util.*;
public class file {
    public static void main(String[] args) {
        // checked expection
        String username ;
        String password;
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Username :");
            username = sc.next();
            System.out.print("Enter password");
            password = sc.next();
            if (username.equals("prashant")){
                if (password.equals("123")){
                    System.out.println("Succesfully login in System");

                } else {
                    RuntimeException ex  = new RuntimeException("User Name Incorrect");
                    throw ex;
                }
            }else {
                RuntimeException  ex = new RuntimeException("Use Name Incoorect");
                        throw ex ;
            }
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
