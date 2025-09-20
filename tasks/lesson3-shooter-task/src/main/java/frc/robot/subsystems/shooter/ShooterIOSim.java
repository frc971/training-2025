package frc.robot.subsystems.shooter;

// Simulation implementation for the Shooter subsystem
public class ShooterIOSim implements ShooterIO {
  // Usually this would be in a Constants file, we have it here for convenience
  private static final double MAX_RPM = 6000.0;

  // TODO: Add a private field `simulatedMotorPercent` to store the simulated motor percentage

  @Override
  public void updateInputs(ShooterIOInputs inputs) {
    // TODO: Simulate motorRPM by multiplying the stored simulatedMotorPercent by the max RPM
    inputs.motorRPM = 0.0; // Placeholder - replace 0.0
  }

  @Override
  public void setMotorPercentOutput(double percent) {
    // TODO: Store the given `percent` in your simulated motor percentage field
  }
}
