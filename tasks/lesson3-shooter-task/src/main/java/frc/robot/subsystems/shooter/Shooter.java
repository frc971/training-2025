package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.shooter.ShooterIO.ShooterIOInputs;

// Main Shooter subsystem logic
public class Shooter extends SubsystemBase {
  private final ShooterIO io;
  private final ShooterIOInputs inputs = new ShooterIOInputs();

  public Shooter(ShooterIO io) {
    this.io = io;
  }

  @Override
  public void periodic() {
    // Update sensor data from io
    io.updateInputs(inputs);

    // Debugging output
    System.out.println("Shooter RPM: " + inputs.motorRPM);
  }

  // Spin the shooter motor at a given percent output
  public void spin(double percent) {
    io.setMotorPercentOutput(percent);
  }

  // Stop the shooter motor
  public void stop() {
    io.setMotorPercentOutput(0.0);
  }

  // Return the current motor RPM
  public double getCurrentRPM() {
    return inputs.motorRPM;
  }
}
