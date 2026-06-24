public class Elevator {
  private int floor;

  public Elevator(int initialFloor) {
    floor = initialFloor;
  }

  public void moveUp() {
    floor++;
  }

  public void moveDown() {
    floor--;
  }

  public int getCurrentFloor() {
    return floor;
  }
}
