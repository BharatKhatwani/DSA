//import oops.Student;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {



        Student kunal = new Student();
        Student rahul = new Student();
//        System.out.println(kunal.name);
//        System.out.println(kunal.rollno);
//        System.out.println(rahul.name);
 Student bharat = new Student (13,"Bharat khatwani", 8.5f);
        System.out.println(bharat.rollno);
        System.out.println(bharat.name);
    }
}
    class Student {
int rollno ;
float marks ;
String name ;

Student(){
    this.rollno =40;
    this.name = "bharat khatwani";

}
        Student (int rollno, String name , float marks){
this.rollno = rollno;
this.name = name ;
this. marks = marks;
        }

    }

