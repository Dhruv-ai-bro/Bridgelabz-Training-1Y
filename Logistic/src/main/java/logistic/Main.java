package logistic;

public class Main {
        public static void main(String[] args) {

            Driver d = new Driver("Kavita");
            d.route.addCheckpoint(new Delivery("C1", "Warehouse", 40, 60, 70));
            d.route.addCheckpoint(new FuelCheckpoint("C2", "Pump", 20, 30, 30));
            d.route.addCheckpoint(new RestCheckpoint("C3", "Motel", 10, 20, 40));

            d.route.printRoute();

            System.out.println("Total Distance: " + d.route.totalDistance());
            System.out.println("Total Penalty: " + d.route.totalPenalty());

        }
}



