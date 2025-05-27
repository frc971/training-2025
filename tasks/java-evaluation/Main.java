import java.io.*;

public class Main {
  public static void main(String[] args) {
    Elevator elevator = new Elevator(1);
    ElevatorController elevatorController = new ElevatorController(elevator, 1, 5);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      try {
        System.out.print("Request floor: ");
        String input = reader.readLine();
        if (input.equals("q")) return;

        try {
          int requestedFloor = Integer.parseInt(input);
          elevatorController.goToFloor(requestedFloor);
        } catch (NumberFormatException e) {
          System.out.println("Please enter a valid number.");
        }
      } catch (IOException ioe) {
        System.out.println(ioe);
        return;
      }
    }
  }
}
