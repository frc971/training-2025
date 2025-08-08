public class ElevatorController {
    Elevator elevator;
    int minFloor;
    int maxFloor;

    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void reset() {
        this.elevator.floor = 1;
    }

    public void goToFloor(int target) {
        if (target < minFloor || target > maxFloor) {
            System.out.println("Floor " + target + " is not a valid floor");
            return;
        }
        
        if (elevator.floor == target) {
            System.out.println("Already at floor " + target);
            return;
        }

        if (elevator.floor < target) {
            while (elevator.floor < target) {
                elevator.moveUp();
            }
        } else {
            while (elevator.floor > target) {
                elevator.moveDown();
            }
        }

        System.out.println("Arrived at floor " + target);
    }
}
