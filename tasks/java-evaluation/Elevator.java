public class Elevator {
    private int floor;

    public Elevator(int floor){
        this.floor = floor;
        System.out.println("Elevator instantiated at floor " + floor);
    }

    public void moveUp(){
        floor++;
    }

    public void moveDown(){
        floor--;
    }  
    public int getCurrentFloor(){
        return floor;
    }
}
