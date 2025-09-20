import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floorafter = 1;
        int floorbefore = 1;
        boolean floortrue = true;
        System.out.println("Welcome to the elevator");
        System.out.println("Elevator initiated at floor 1");
        while (true) {
            System.out.println("Floor request:");
            floorafter = scan.nextInt();
            if (floorafter > 5 || floorafter < 1) {
                System.out.println("Sorry that is not a valid floor");
                floortrue = false;
            } else if (floorafter > floorbefore) {
                System.out.println("Going up");
                for (int i = floorbefore; i <= floorafter; i++) {
                System.out.println("Floor " + i);
            }
                
            } else if (floorafter == floorbefore) {
                System.out.println("That is the same floor");
            } else {
                System.out.println("Going down");
                for (int i = floorbefore; i >= floorafter; i--) {
                    System.out.println("Floor " + i);
                }
                
            }
            
            if (floortrue) {
                floorbefore = floorafter;
            }
            System.out.println("Elevator initiated at floor "+floorbefore);
            floortrue = true;
            
        }

    }
}


