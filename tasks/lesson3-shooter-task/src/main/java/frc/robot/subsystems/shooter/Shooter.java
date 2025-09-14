package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

// Main Shooter subsystem logic
public class Shooter extends SubsystemBase {
  private ShooterIO shooterIO;
  private ShooterIO.ShooterIOInputs inputs =  new ShooterIO.ShooterIOInputs();

  public Shooter(ShooterIO io) {
    this.shooterIO = io;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    shooterIO.updateInputs(inputs);
    System.out.println(getCurrentRPM());
  }

  // public void spin(double percent) { ... }
  public void spin(double percent) {
    shooterIO.setMotorPercentOutput(percent);
  }
  // public void stop() { ... }
  public void stop() {
    shooterIO.setMotorPercentOutput(0.0);
  }
  public double getCurrentRPM() {
    return inputs.motorRPM;
  }
}
