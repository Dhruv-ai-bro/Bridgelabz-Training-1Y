package logistic;

public class RouteLinkedList <T extends Checkpoint> {

    class Node {
        Checkpoint data;
        Node next;

        Node(Checkpoint data) {
            this.data = data;
        }
    }

    Node head;

    void addCheckpoint(Checkpoint c) {
        Node newNode = new Node(c);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void printRoute() {
        Node temp = head;

        while (temp != null) {
            Checkpoint c = temp.data;

            String status;
            if (c.isDelayed()) {
                status = "Delayed";
            } else {
                status = "On Time";
            }

            System.out.println(c.getType() + " - " + c.location + " - " + status);
            temp = temp.next;
        }
    }

    double totalDistance() {
        double sum = 0;
        Node temp = head;

        while (temp != null) {
            sum = sum + temp.data.distance;
            temp = temp.next;
        }

        return sum;
    }

    double totalPenalty() {
        double sum = 0;
        Node temp = head;

        while (temp != null) {
            sum = sum + temp.data.calculatePenalty();
            temp = temp.next;
        }

        return sum;
    }
}
