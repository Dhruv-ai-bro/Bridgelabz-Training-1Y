package logistic;

public class Driver {


        String name;
        RouteLinkedList route;

        Driver(String name) {
            this.name = name;
            this.route = new RouteLinkedList();
        }
}
