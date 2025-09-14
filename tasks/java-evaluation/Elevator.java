import java.util.Scanner;

//Elevator: Tracks and moves floors
class Elevator {
    private int floor;

    //Constructor
    Elevator(int initialFloor) {
        floor = initialFloor;
    }

    //moveUp
    int moveUp() {
        floor += 1;
        return floor;
    }

    //moveDown
    int moveDown() {
        floor -= 1;
        return floor;
    }

    //getCurrentFloor
    int getCurrentFloor() {
        return floor;
    }
}

//ElevatorController: Tells Elevator how to move, rejects invalid floors
class ElevatorController {
    Elevator currentFloor;
    int minFloor;
    int maxFloor;

    ElevatorController(Elevator elevatorInstance, int min, int max) {
        currentFloor = elevatorInstance;
        System.out.println("Elevator instantiated at floor " + currentFloor.getCurrentFloor());
        minFloor = min;
        maxFloor = max;
    }


    void goToFloor(int targetFloor) {
        if (targetFloor > maxFloor || targetFloor < minFloor) {
            System.out.println("Floor " + targetFloor + " is not a valid floor.");
        } else {
            while (currentFloor.getCurrentFloor() != targetFloor) {
                if (currentFloor.getCurrentFloor() < targetFloor) {
                    currentFloor.moveUp();
                    System.out.println("Moving up... Now at floor " + currentFloor.getCurrentFloor());

                } else if (currentFloor.getCurrentFloor() > targetFloor) {
                    currentFloor.moveDown();
                    System.out.println("Moving down... Now at floor " + currentFloor.getCurrentFloor());
                }
            }
            System.out.println("Arrived at floor " + currentFloor.getCurrentFloor());
        }
    }
}


//Main: Loops the program
class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Elevator currentFloor = new Elevator(1);
        ElevatorController controller = new ElevatorController(currentFloor, 1, 5);

        while(true) {
            System.out.println("Request Floor: ");
            String stinky = userInput.next();
            if (!stinky.equalsIgnoreCase("quit")) {
                try {
                    controller.goToFloor(Integer.parseInt(stinky));
                }
                catch (NumberFormatException e) {}
            }
            else {
                break;
            }
        }
    }
}


