import java.util.LinkedList;

public class CheckpointDetails implements Penalty{

    String checkpointid;
    String LocationName;
    int DistanceFromLast;
    int ExpectedDuration;
    int ActualDuration;
    boolean Delay;
    int penalty;

    LinkedList<Integer> Checkout = new LinkedList<>();

    public boolean isDelay() {
        return Delay;
    }

    public void setDelay(boolean delay) {
        Delay = delay;
    }

    public String getCheckpointid() {
        return checkpointid;
    }

    public void setCheckpointid(String checkpointid) {
        this.checkpointid = checkpointid;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public int getDistanceFromLast() {
        return DistanceFromLast;
    }

    public void setDistanceFromLast(int distanceFromLast) {
        DistanceFromLast = distanceFromLast;
    }

    public int getExpectedDuration() {
        return ExpectedDuration;
    }

    public void setExpectedDuration(int expectedDuration) {
        ExpectedDuration = expectedDuration;
    }

    public int getActualDuration() {
        return ActualDuration;
    }

    public void setActualDuration(int actualDuration) {
        ActualDuration = actualDuration;
    }

    @Override
    public void PenaltyCal() {

        if(ActualDuration>30){
            Delay = false;
        }

        if(ActualDuration>ExpectedDuration){
            penalty = (ActualDuration-ExpectedDuration)*2;
            if(Delay==false){
                penalty = (int) ((ActualDuration-ExpectedDuration) * 0.5);
            }
        }

        if(ActualDuration == ExpectedDuration){
            System.out.println("No delay");
        }
        System.out.println("penalty= "+penalty);
    }
}
