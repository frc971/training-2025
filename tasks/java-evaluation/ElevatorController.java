public class ElevatorController {
  private Elevator elevator;
  private final int MIN_FLOOR;
  private final int MAX_FLOOR;

  public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
    this.elevator = elevator;
    this.MIN_FLOOR = minFloor;
    this.MAX_FLOOR = maxFloor;

    System.out.println("Elevator instantiated at floor " + elevator.getCurrentFloor());
  }

  public void goToFloor(int goalFloor) {
    if (goalFloor < MIN_FLOOR || goalFloor > MAX_FLOOR) {
      System.out.println("Floor " + goalFloor + " is not a valid floor");
      return;
    }

    while (elevator.getCurrentFloor() != goalFloor) {
      if (goalFloor > elevator.getCurrentFloor()) {
        elevator.moveUp();
        System.out.println("Moving up... now at floor " + elevator.getCurrentFloor());
      } else {
        elevator.moveDown();
        System.out.println("Moving down... now at floor " + elevator.getCurrentFloor());
      }
    }

    System.out.println("Arrived at floor " + elevator.getCurrentFloor());
  }
}
