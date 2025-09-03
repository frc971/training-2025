public class Elevator {
  /* methods moveUp()`, `moveDown()`, `getCurrentFloor()*/

  //global variable
  public static int currentFloor;
    
  public Elevator(int initialFloor) {
    Elevator.currentFloor = initialFloor;
    System.out.println("Elevator instantiated at floor " + Elevator.currentFloor);
  }

  public int getCurrentFloor() {
    return Elevator.currentFloor;
  }

  public void moveUp() {
    Elevator.currentFloor += 1;
    System.out.println("Moving up... now at floor " + Elevator.currentFloor);
  }

  public void moveDown() {
    Elevator.currentFloor -= 1;
    System.out.println("Moving down... now at floor " + Elevator.currentFloor);
  }
}
