public class ElevatorController {
  private Elevator elevator;
  private final int MIN_FLOOR;
  private final int MAX_FLOOR;

  public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
    this.elevator = elevator;
    this.MIN_FLOOR = minFloor;
    this.MAX_FLOOR = maxFloor;

    System.out.printf("Elevator is at floor %d.%n", elevator.getCurrentFloor());
  }

  public void goToFloor(int goalFloor) {
    System.out.printf("Requested to go to floor %d.%n", goalFloor);

    if (goalFloor < MIN_FLOOR || goalFloor > MAX_FLOOR) {
      System.out.printf("Floor %d is not a valid floor.%n", goalFloor);
      return;
    }

    while (elevator.getCurrentFloor() != goalFloor) {
      if (goalFloor > elevator.getCurrentFloor()) {
        elevator.moveUp();
      } else {
        elevator.moveDown();
      }
    }

    System.out.printf("Arrived at floor %d.%n", elevator.getCurrentFloor());
  }
}
