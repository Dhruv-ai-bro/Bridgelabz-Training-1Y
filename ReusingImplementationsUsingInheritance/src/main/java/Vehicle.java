class Vehicle {
    protected int maxSpeed;
    protected String fuelType;


    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed : " + maxSpeed + " km/h");
        System.out.println("Fuel Type : " + fuelType);
    }
}


class Car extends Vehicle {

    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Car Details -----");
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}


class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Truck Details -----");
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}


class Motorcycle extends Vehicle {

    private boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Motorcycle Details -----");
        super.displayInfo();
        System.out.println("Has Gear : " + hasGear);
    }
}


public class VehicleTransportSystem {

    public static void main(String[] args) {


        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 15);
        Vehicle v3 = new Motorcycle(140, "Petrol", true);


        Vehicle[] vehicles = {v1, v2, v3};


        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("---------------------------");
        }
    }
}
