package pratice;




public class staticblock {
    static int a = 45;
    static int b;

    static {
        System.out.println("i am great in the life going it");
        b = 5 * a;
    }

    public static void main(String[] args) {


        staticblock obj = new staticblock();
        System.out.println(staticblock.a +  " " + staticblock.b);
    }


}