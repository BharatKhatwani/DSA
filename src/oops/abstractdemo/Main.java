package oops.abstractdemo;

public class Main {
    public static void main(String[] args) {
       Son son = new Son(20);
       son.career();

       Daughter daughter = new Daughter(18);
       daughter.career();

       Parent.hello();


    }
}

