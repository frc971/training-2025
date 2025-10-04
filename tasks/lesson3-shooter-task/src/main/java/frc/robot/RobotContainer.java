package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.shooter.Shooter;
import frc.robot.subsystems.shooter.ShooterIOSim;
import frc.robot.subsystems.shooter.ShooterIOTalonFX;

public class RobotContainer {
  private final CommandJoystick joystick = new CommandJoystick(0);

  private final Shooter shooter;

  public RobotContainer() {
    // Use real or sim ShooterIO
    shooter = new Shooter(RobotBase.isReal() ? new ShooterIOTalonFX() : new ShooterIOSim());

    configureBindings();
  }

  private void configureBindings() {
    joystick
        .button(1)
        .whileTrue(Commands.run(() -> shooter.spin(0.5), shooter))
        .onFalse(Commands.run(() -> shooter.stop(), shooter));
  }
}
