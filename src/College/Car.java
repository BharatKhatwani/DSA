package College;

public class Car {
    private int year;
    private String make;
    private double speed;

    // Constructor to initialize the year, make, and speed fields
    public Car(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    // Getter method to get the car's year
    public int getYear() {
        return year;
    }

    // Getter method to get the car's make
    public String getMake() {
        return make;
    }

    // Getter method to get the car's speed
    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        // Create a Car object and initialize its fields
        Car myCar = new Car(2015, "Honda", 85.0);

        // Get and display the car's information
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Speed: " + myCar.getSpeed());

        // You can also update the values using setter methods if needed
        // myCar.setYear(2018);
        // myCar.setMake("Toyota");
        // myCar.setSpeed(90.0);
    }
}
