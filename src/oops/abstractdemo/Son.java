package oops.abstractdemo;

public class Son extends Parent {


    @Override
    void career() {
        System.out.println("i make a super hero");
    }
public Son (int age ){
        super(age);
}
@Override
void normal() {
    System.out.println(" it is normal method");
}


    @Override
    void partner() {
        System.out.println("i love the don");
    }
}