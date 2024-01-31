package oops.staticexample_oops2;

// this is a demo to show initialisation of static variables
public class k3_StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        k3_StaticBlock obj = new k3_StaticBlock();
        System.out.println(k3_StaticBlock.a + " " + k3_StaticBlock.b);

        k3_StaticBlock.b += 3;

        System.out.println(k3_StaticBlock.a + " " + k3_StaticBlock.b);

        k3_StaticBlock obj2 = new k3_StaticBlock();
        System.out.println(k3_StaticBlock.a + " " + k3_StaticBlock.b);
    }

}