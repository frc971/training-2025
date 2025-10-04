package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

// Main Shooter subsystem logic
public class Shooter extends SubsystemBase {
  // TODO: Add a private field for your ShooterIO instance
  private ShooterIO shooterIO;
  // TODO: Add a private field for your ShooterIOInputs instance and initialize it
  private ShooterIO.ShooterIOInputs inputs = new ShooterIO.ShooterIOInputs();
  // TODO: Create the constructor that takes a ShooterIO instance as a parameter
  public Shooter(ShooterIO io) {
    shooterIO = io;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // TODO: Call the updateInputs method on your ShooterIO instance
    shooterIO.updateInputs(inputs);
    System.out.println(getCurrentRPM());
  }

  // TODO: Add a public method to spin the shooter motor at a given percentage output
  public void spin(double percent) {
    shooterIO.setMotorPercentOutput(percent);
  }

  // TODO: Add a public method to stop the shooter motor
  public void stop() {
    shooterIO.setMotorPercentOutput(0);
  }

  // TODO: Add a public method to return the current motor RPM
  public double getCurrentRPM() {
    return inputs.motorRPM;
  }
}
