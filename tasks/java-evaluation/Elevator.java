public class Elevator {
  private int floor;

  public Elevator(int initialFloor) {
    floor = initialFloor;
  }

  public void moveUp() {
    floor++;
    System.out.printf("Moving up... now at floor %d.%n", floor);
  }

  public void moveDown() {
    floor--;
    System.out.printf("Moving down... now at floor %d.%n", floor);
  }

  public int getCurrentFloor() {
    return floor;
  }
}
