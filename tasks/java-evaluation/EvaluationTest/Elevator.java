public class Elevator {

    private int floor;

    public Elevator(int init) {
        floor = init;
        System.out.print("Elevator instantiated at floor " + floor + "\n");
    }

    public void moveUp() {
        floor += 1;
    }

    public void moveDown() {
        floor -= 1;
    }

    public int getCurrentFloor() {
        return floor;
    }
}