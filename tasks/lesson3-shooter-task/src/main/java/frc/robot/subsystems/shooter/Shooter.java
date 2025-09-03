package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.shooter.ShooterIO.ShooterIOInputs;

// Main Shooter subsystem logic
public class Shooter extends SubsystemBase {
  // Add a private field for your ShooterIO instance
  private ShooterIO shooterIO = new ShooterIOTalonFX();
  // Add a private field for your ShooterIOInputs instance and initialize it
  private ShooterIOInputs shooterIOInputs = new ShooterIOInputs();
  // Create the constructor that takes a ShooterIO instance as a parameter
  public Shooter(ShooterIO io) {
    this.shooterIO = io;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // Call the updateInputs method on your ShooterIO instance
    shooterIO.updateInputs(shooterIOInputs);
    System.out.println(shooterIOInputs.motorRPM);
  }

  // Add a public method to spin the shooter motor at a given percentage output
  public void spin(double percent) {
    shooterIO.setMotorPercentOutput(percent);
  }

  // Add a public method to stop the shooter motor
  public void stop() {
    shooterIO.setMotorPercentOutput(0.0);
  }

  // Add a public method to return the current motor RPM
  public double getCurrentRPM() {
    return shooterIOInputs.motorRPM;
  }
}
