package frc.robot.subsystems.shooter;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

// Real hardware implementation for the Shooter using TalonFX motor
public class ShooterIOTalonFX implements ShooterIO {
  // Create a TalonFX motor object
  private final TalonFX motor;

  // Create a DutyCycleOut control mode object for percent output
  private final DutyCycleOut dutyCycleOut = new DutyCycleOut(0);

  public ShooterIOTalonFX() {
    // Initialize the motor with CAN ID 1
    motor = new TalonFX(1);

    // Configure the motor with brake neutral mode
    var config = new TalonFXConfiguration();
    config.MotorOutput.NeutralMode = NeutralModeValue.Brake;
    motor.getConfigurator().apply(config);
  }

  @Override
  public void updateInputs(ShooterIOInputs inputs) {
    // Read the motor’s velocity (rotations per second) as a double using
    double rps = motor.getVelocity().getValueAsDouble();

    // Save the RPM to inputs.motorRPM (convert from rotations per second)
    inputs.motorRPM = rps * 60;
  }

  @Override
  public void setMotorPercentOutput(double percent) {
    // Use motor.setControl and the dutyCycleOut variable to set the motor’s percent output
    motor.setControl(dutyCycleOut);
  }
}
