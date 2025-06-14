import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Elevator elevator = new Elevator(1);
    ElevatorController elevatorController = new ElevatorController(elevator, 1, 5);

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Request floor: ");
      String input = scanner.next();

      if (input.equals("q")) break;

      try {
        int requestedFloor = Integer.parseInt(input);
        elevatorController.goToFloor(requestedFloor);
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
      }
    }

    scanner.close();
  }
}
