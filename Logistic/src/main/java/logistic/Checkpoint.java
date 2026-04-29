package logistic;

public abstract class Checkpoint {

    String id;
    String location;
    double distance;
    int expectedTime;
    int actualTime;

    Checkpoint(String id, String location, double distance, int expectedTime, int actualTime) {
        this.id = id;
        this.location = location;
        this.distance = distance;
        this.expectedTime = expectedTime;
        this.actualTime = actualTime;
    }

    boolean isDelayed() {
        return actualTime > expectedTime;
    }

    abstract double calculatePenalty();
    abstract String getType();

    }


