package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class RobotContainer {
  private final CommandJoystick joystick = new CommandJoystick(0);

  // private final Shooter shooter;

  public RobotContainer() {
    // Use real or sim ShooterIO
    // shooter = new Shooter(RobotBase.isReal() ? new ShooterIOTalonFX() : new ShooterIOSim());

    configureBindings();
  }

  private void configureBindings() {
    // joystick.button(1).whileTrue(shooter.runAtRPM(3000)).onFalse(shooter.runAtRPM(0));
  }
}
