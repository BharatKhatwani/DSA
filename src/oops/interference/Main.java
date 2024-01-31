package oops.interference;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
       // car.a;
//        car.acc();
//        car.start();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();
//
        Engine car_2 = new ElecticEngine();
        car_2.acc();
        car_2.start();

        Engine car_4 = new PowerEngine();
        car_4.start();
        car_4.acc();
        car_4.stop();





//
//        NiceCar car = new NiceCar();
//
//        car.start();
//        car.startMusic();
//        car.upgradeEngine();
//        car.start();
    }
}