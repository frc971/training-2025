package frc.robot.subsystems.shooter;

// Simulation implementation for the Shooter subsystem
public class ShooterIOSim implements ShooterIO {
  // Usually this would be in a Constants file, we have it here for convenience
  private static final double MAX_RPM = 6000.0;

  // Store the simulated motor percentage
  private double simulatedMotorPercent = 0.0;

  @Override
  public void updateInputs(ShooterIOInputs inputs) {
    // Simulate motor RPM
    inputs.motorRPM = simulatedMotorPercent * MAX_RPM;
  }

  @Override
  public void setMotorPercentOutput(double percent) {
    simulatedMotorPercent = percent;
  }
}
