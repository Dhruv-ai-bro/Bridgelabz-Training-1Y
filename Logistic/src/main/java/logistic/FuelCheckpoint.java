package logistic;

public class FuelCheckpoint extends Checkpoint{


    FuelCheckpoint(String id, String location, double distance, int exp, int act) {
        super(id, location, distance, exp, act);
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }

    String getType() {
        return "Fuel";
    }
}
