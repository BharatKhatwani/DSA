package oops.abstractdemo;

public class Daughter extends Parent{

public Daughter (int age){
    super(age);
}


    @Override
    void normal() {
        System.out.println("it is normal class of the student in it");
    }

    @Override
    void career() {
        System.out.println(" I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
