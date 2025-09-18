// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.Indexer;

public class RobotContainer {
  // Subsystems
  private final Indexer indexer = new Indexer();

  // Controller
  private final CommandJoystick joystick = new CommandJoystick(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    // TODO: Bind indexForSeconds(1.5) to joystick button 1
    joystick.button(1).onTrue(indexer.indexForSeconds(1.5));
  }

  public Command getAutonomousCommand() { 
    return null;
  }
}
