import java.util.LinkedList;
import java.util.Scanner;


public class DeliveryCheckpoint extends CheckpointDetails{

    LinkedList<String> checkout = new LinkedList<>();

    public void checkpoint(){
        checkout.add("Delhi");
        checkout.add("agra");
        checkout.add("mathura");
    }



}
