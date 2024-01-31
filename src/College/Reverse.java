package College;

public class Reverse {
    public static int availableSeats = 8;
            public  int a;
            public Reverse(){
                a = 0;
            }
            public Reverse (int a){
                this.a = a;
            }
            public Reverse(int a , int newData){
                this.a = a;
                Reverse.availableSeats = newData;
            }
            public void setData(int newData){
                Reverse.availableSeats += newData;
            }
            void setData(int a , int newData){
                this.a = a;
                Reverse.availableSeats = newData;
            }
            void showData(){
                System.out.println("a" + a);
                System.out.println("Available Seats");
                System.out.println(Reverse.availableSeats);
            }
            public void run(){
                this.setData(30);
                this.setData(45);
            }
}
