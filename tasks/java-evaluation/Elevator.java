public class Elevator {
    private int floor;

    public Elevator(int start) {
        System.out.println("Elevator instantiated at floor " + start);
        floor = start;
    }

    public void moveUp() {
        floor++;
        System.out.println("Moving up... now at floor " + floor);
    }

    public void moveDown() {
        floor--;
        System.out.println("Moving down... now at floor " + floor);
    }

    public int getCurrentFloor() {
        return floor;
    }
}