package oops.staticexample_oops2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;     // for every one population is same in the case we can use static

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}