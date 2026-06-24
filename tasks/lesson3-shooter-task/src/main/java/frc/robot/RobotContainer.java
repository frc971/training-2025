package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.shooter.Shooter;
import frc.robot.subsystems.shooter.ShooterIOSim;
import frc.robot.subsystems.shooter.ShooterIOTalonFX;

public class RobotContainer {
  private final CommandJoystick joystick = new CommandJoystick(0);

  // Declare the Shooter subsystem
  private final Shooter shooter;

  public RobotContainer() {
    // Instantiate with real or sim implementation
    shooter = new Shooter(RobotBase.isReal() ? new ShooterIOTalonFX() : new ShooterIOSim());

    configureBindings();
  }

  private void configureBindings() {
    // Spin shooter at 50% while holding button 1
    joystick
        .button(1)
        .whileTrue(Commands.run(() -> shooter.spin(0.5), shooter))
        .onFalse(Commands.run(() -> shooter.stop(), shooter));
  }
}
