package STRING;

public class k2_Comparsion {
    public static void main(String[] args) {
        String a ="kunal";
        String  b = "kunal"; // it is a string pool
        //== it is a comparsion or .equal it is method
     //   System.out.println(a==b);
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(4));
    }
}
