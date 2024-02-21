class Bike implements Vehicle {

	 @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    } 

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bike is braking.");
    }
}
