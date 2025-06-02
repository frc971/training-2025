// ShooterIO.java Template - Copy this into your file
package frc.robot.subsystems.shooter;

// Interface defining the contract for Shooter hardware/simulation implementations
public interface ShooterIO {
  class ShooterIOInputs {
    public double motorRPM = 0.0;
  }

  /** Updates the sensor data from the motor(s) into the inputs object. */
  void updateInputs(ShooterIOInputs inputs);

  /**
   * Sets the motor output percentage for the shooter.
   *
   * @param percent Output percentage from -1.0 to 1.0.
   */
  void setMotorPercentOutput(double percent);
}
