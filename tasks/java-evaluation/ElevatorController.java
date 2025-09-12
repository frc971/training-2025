import java.lang.ModuleLayer.Controller;

public class ElevatorController {
/* Request floor: 8
Floor 8 is not a valid floor
*/
    private Elevator elevator;
    private int minFloor;
    private int maxFloor;

    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void goToFloor(int targetFloor) {
        if(targetFloor > this.maxFloor || targetFloor < this.minFloor) {
            System.out.println("Floor " + targetFloor + " is not a valid floor");
            return;
        }

        while(Elevator.currentFloor > targetFloor) {
            elevator.moveDown();
        }

        while(Elevator.currentFloor < targetFloor) {
            elevator.moveUp();
        }

        elevator.getCurrentFloor();
        System.out.println("Arrived at floor " + Elevator.currentFloor);
        return;
    }
}
