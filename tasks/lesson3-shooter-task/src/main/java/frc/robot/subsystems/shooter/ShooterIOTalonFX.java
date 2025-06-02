package frc.robot.subsystems.shooter;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.DutyCycleOut; // Correct control mode for percent output
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

// Real hardware implementation using TalonFX
public class ShooterIOTalonFX implements ShooterIO {
  private final TalonFX motor;
  private final DutyCycleOut percentOutputControl = new DutyCycleOut(0);

  public ShooterIOTalonFX() {
    // Assuming motor ID 1 for demonstration
    motor = new TalonFX(1);

    // Configure the motor
    var config = new TalonFXConfiguration();
    config.MotorOutput.NeutralMode = NeutralModeValue.Brake;
    motor.getConfigurator().apply(config);
  }

  @Override
  public void updateInputs(ShooterIOInputs inputs) {
    // Get motor velocity (often in ticks per 100ms or rotations per second,
    // depending on configuration. For simplicity, we'll assume a direct relation to RPM)
    // In a real robot, you'd convert this to actual RPM.
    double rawVelocity = motor.getVelocity().getValueAsDouble(); // Example: rotations per second
    // A simple conversion, assuming 60 rotations/second = 3600 RPM
    inputs.motorRPM = rawVelocity * 60.0;
  }

  @Override
  public void setMotorPercentOutput(double percent) {
    motor.setControl(percentOutputControl.withOutput(percent));
  }
}
