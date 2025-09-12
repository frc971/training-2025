import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);

        Scanner scan = new Scanner(System.in);
        String request;
        while (true) {
            System.out.print("Request floor: ");
            request = scan.next();
            if (request.equals("quit")) {
                break;
            }
            controller.goToFloor(Integer.parseInt(request));
            System.out.println();
        }
        scan.close();
    }
}
