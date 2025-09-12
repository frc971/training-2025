package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.shooter.ShooterIO.ShooterIOInputs;

// Main Shooter subsystem logic
public class Shooter extends SubsystemBase {
  // TODO: Add a private field for your ShooterIO instance
  private final ShooterIO io;
  // TODO: Add a private field for your ShooterIOInputs instance and initialize it
  private final ShooterIOInputs ShooterIOInput = new ShooterIOInputs();
  // TODO: Create the constructor that takes a ShooterIO instance as a parameter
  public Shooter(ShooterIO io) {
    this.io = io;
  }
  // public Shooter(ShooterIO io) { ... }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // TODO: Call the updateInputs method on your ShooterIO instance
    io.updateInputs(ShooterIOInput);

    System.out.println("Shooter RPM: " + ShooterIOInput.motorRPM);
  }

  // TODO: Add a public method to spin the shooter motor at a given percentage output
  // public void spin(double percent) { ... }
  public void spin(double percent) {
    io.setMotorPercentOutput(percent);
  }

  // TODO: Add a public method to stop the shooter motor
  // public void stop() { ... }
  public void stop() {
    io.setMotorPercentOutput(0.0);
  }

  // TODO: Add a public method to return the current motor RPM
  // public double getCurrentRPM() { ... }
  public double getCurrentRPM() {
    return ShooterIOInput.motorRPM;
  }
}
