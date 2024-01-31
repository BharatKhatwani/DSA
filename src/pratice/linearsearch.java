package pratice;

public class linearsearch {

    public static void main(String[] args) {
        Student  ruhal = new Student(12,"aditya");
        Student kunal = new Student();
kunal.greeting();
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);

        Student random = new Student();
        System.out.println(random.name);
    }
}
    class Student{
        int rollno = 45;
        String name = "Bharat";


        void greeting(){
            System.out.println("hello ! my name is " + this.name);
        }

        Student(){
this(56, "the");
        }

Student (int rollno,String name ){
            this.rollno = rollno;
            this.name = name ;
}
    }

