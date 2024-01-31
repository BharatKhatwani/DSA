package pratice;

class MyRunnable implements Runnable{
    public void run(){
        for (int i =0; i <= 5 ; i++){
            System.out.println("bharat" + i);
        }
    }
}
public class Main_3 {
    public static void main(String[] args) {
     MyRunnable t = new MyRunnable();
     Thread t1 = new Thread(t);
     t1.start();
    }
}