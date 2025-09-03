public class Main {
    public static void main(String[] args) {
        Elevator original = new Elevator(1);
        ElevatorController controller = new ElevatorController(original,1,5);
        controller.goToFloor(3);
        controller.goToFloor(8);
        controller.goToFloor(1);
        System.out.println("\nRequest floor: quit");
    }
}
