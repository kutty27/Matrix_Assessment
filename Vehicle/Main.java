public class Main {
    public static void main(String[] args) {
        // Create instances of Bike and Car
        Bike myBike = new Bike();
        Car myCar = new Car();

        // Test the methods
        myBike.start();
        myBike.accelerate();
        myBike.brake();
        myBike.stop();

        System.out.println(); // Separate bike and car outputs

        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}
