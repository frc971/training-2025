public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);
        controller.goToFloor(3);
        controller.goToFloor(2);
        controller.goToFloor(0);
        controller.goToFloor(6);
        controller.goToFloor(5);
        controller.goToFloor(1);
    }
}