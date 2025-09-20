public class ElevatorController {
    private int minFloor;
    private int maxFloor;
    private Elevator elevator;

    public ElevatorController(Elevator e, int min, int max) {
        elevator = e;
        minFloor = min;
        maxFloor = max;
    }

    public void goToFloor(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Floor " + floor + " is not a valid floor");
        } else {
            while (elevator.getCurrentFloor() != floor) {
                if (elevator.getCurrentFloor() < floor) {
                    elevator.moveUp();
                } else {
                    elevator.moveDown();
                }
            }
            System.out.println("Arrived at floor " + floor);
        }
    }
}