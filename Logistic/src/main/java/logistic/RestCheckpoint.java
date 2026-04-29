package logistic;

public class RestCheckpoint extends Checkpoint{

    RestCheckpoint(String id, String location, double distance, int exp, int act) {
        super(id, location, distance, exp, act);
    }

    double calculatePenalty() {
        if (isDelayed()) {
            int delay = actualTime - expectedTime;
            if (delay > 30) {
                return delay * 0.5;
            }
        }
        return 0;
    }

    String getType() {
        return "Rest";
    }

}
