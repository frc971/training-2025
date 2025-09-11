public class ElevatorController {

    private int min, max;
    private Elevator elevator;

    public ElevatorController (Elevator instance, int minFloor, int maxFloor) {
        min = minFloor;
        max = maxFloor;
        elevator = instance;
    }

    public void goToFloor(int target) {
        if (target < min || target > max) {
            System.out.print("Floor " + target + " is not a valid floor" + "\n");
            return;
        }
        while (elevator.getCurrentFloor() != target) {
            int distance = target - elevator.getCurrentFloor();
            if (distance < 0) {
                elevator.moveDown();
                System.out.print("Moving down... now at floor " + elevator.getCurrentFloor() + "\n");
            } else {
                elevator.moveUp();
                System.out.print("Moving up... now at floor " + elevator.getCurrentFloor() + "\n");
            }
        }
        System.out.print("Arrived at floor " + target + "\n");
    }
}
