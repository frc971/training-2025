public class Elevator {
    int floor;

    public Elevator(int floor) {
        this.floor = floor;
        System.out.println("Elevator instantiated at floor " + this.floor);
    }

    public void moveUp() {
        this.floor++;
        System.out.println("Moving up... now at floor " + this.floor); 
    }

    public void moveDown() {
        this.floor--;
        System.out.println("Moving down... now at floor " + this.floor);
    }

    public int getCurrentFloor() {
        return this.floor;
    }
}
